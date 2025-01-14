package pgs;

public class PSG_두_원사이의_정수쌍 {
    public static void main(String[] args) {
        int r1 = 2, r2 = 3;
        long solution = solution(2, 3);
        System.out.println(solution);
    }

    public static long solution(int r1, int r2) {
        long answer = 0;

        // x^2 + y^2
        double r1Pow = Math.pow(r1, 2);
        double r2Pow = Math.pow(r2, 2);
        int line = (r2-r1+1) * 4;

        for(int i = 0; i <= r2; i++){
            double test = Math.pow(i, 2);
            double y1 = Math.sqrt(r1Pow -test);
            double y2 = Math.sqrt(r2Pow -test);

            answer += ((long)y2 - (long)Math.ceil(y1) + 1);
        }

        answer = answer*4 - line;

        return answer;
    }
}
