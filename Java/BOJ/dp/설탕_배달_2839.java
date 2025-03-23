package boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕_배달_2839 {
    // Nkg -> 3,5kg만 있음
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1];

        dp[3] = 1;
        if(N >= 5) dp[5] = 1;

        int count = Integer.MAX_VALUE;

        for (int i = 6; i <= N; i++) {
            if (dp[i - 5] != 0 && dp[i - 3] != 0) {
                dp[i] = Math.min(dp[i - 5] + 1, dp[i - 3] + 1);
            } else if (dp[i - 5] != 0 && dp[i - 3] == 0) {
                dp[i] = dp[i - 5] + 1;
            } else if (dp[i - 5] == 0 && dp[i - 3] != 0) {
                dp[i] = dp[i - 3] + 1;
            }
        }
        if(dp[N] == 0) System.out.println(-1);
        else System.out.println(dp[N]);
    }
}
