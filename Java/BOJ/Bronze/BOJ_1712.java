package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1712 {
    // 문제 이름: 손익분기점
    // 난이도: Bronze 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int result = 1;
        // A + B*N < C*N
        if(B >= C){
            result = -1;
            System.out.println(result);
        } else{
            while(true){
                if(A < (C-B)*result){
                    System.out.println(result);
                    break;
                }
                result++;
            }
        }
    }
}
