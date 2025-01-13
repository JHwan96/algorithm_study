package pgs;

import java.util.Arrays;

public class PSG_요격시스템 {
    // 난이도: 2단계
    // 이름: 요격 시스템
    public static void main(String[] args) {
        int[][] targets = new int[][]{{4,5}, {4,8},{10,14},{11,13},{5,12},{3,7},{1,4}};
        int answer = Solution(targets);
        System.out.println(answer);
        return;
    }

    public static int Solution(int[][] targets) {
        int answer = 0;

        Arrays.sort(targets, (o1,o2) -> o1[1]-o2[1]);

        int check = 0;      // 미사일 x좌표
        for(int i = 0; i < targets.length; i++){
            if(check <= targets[i][0]){
                check = targets[i][1];
                answer++;
            }
        }
        return answer;
    }
}
