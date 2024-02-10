package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2193 {
    //문제 이름: 이친수
    //난이도: silver 3
    //1 1 2 3 5
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long[] dp = new long[91];
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3; i < 91; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        int N = Integer.parseInt(br.readLine());
        System.out.println(dp[N]);
    }
}
