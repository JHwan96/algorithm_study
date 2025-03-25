package boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1_2_3_더하기_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] dp;

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            dp = new int[n+1];
            dp[1] = 1;
            dp[2] = 1;
            dp[3] = 1;
            for(int j = 2; j <= n; j++) {
                if(j-1 >= 1) {
                    dp[j] += dp[j-1];
                }
                if(j-2 >= 1) {
                    dp[j] += dp[j-2];
                }
                if(j-3 >= 1) {
                    dp[j] += dp[j-3];
                }
            }
            System.out.println(dp[n]);
        }
    }
}
