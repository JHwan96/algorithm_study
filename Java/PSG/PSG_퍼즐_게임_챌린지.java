package pgs;

public class PSG_퍼즐_게임_챌린지 {
    //난이도: 2단계
    //이름: [PCCP 기출문제] 2번 / 퍼즐 게임 챌린지
    public static void main(String[] args) {
        int[] diffs = new int[]{1,5,3};
        int[] times = new int[]{2,4,7};
        int limit = 30;
        int solution = solution(diffs, times, limit);
        System.out.println(solution);
    }

    private static int solution(int[] diffs, int[] times, long limit) {
        int min = 1;
        int max = 100000;
        int answer = 0;
        while(min <= max) {
            long temp = 0;
            int mid = (min + max) / 2;
            for(int i = 0; i < diffs.length; i++){
                if(diffs[i] <= mid) {
                    temp += times[i];
                    continue;
                }
                if(i == 0) {
                    temp += (diffs[i]-mid+1) * times[i];
                } else {
                    temp += (diffs[i]-mid) * (times[i-1] + times[i]) + times[i];
                }
            }
            if(limit >= temp){
                answer = mid;
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return answer;
    }
}
