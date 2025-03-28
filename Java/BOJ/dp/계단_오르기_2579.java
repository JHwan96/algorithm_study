package boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단_오르기_2579 {
    public static void main(String[] args) throws IOException {
        // 연속된 3개가 안되기 때문에 -> 4개의 패턴 확인
        // i가 되는 경우: (i+2 + i) 거나
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] stair = new int[n+3];
        int[] dp = new int[n+1];
        for(int i = 1; i <= n; i++) {
            stair[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = stair[1];
        dp[2] = stair[2] + stair[1];
        dp[3] = Math.max(stair[1]+stair[3], stair[2] + stair[3]);

        if(n >= 4) {
            for (int i = 4; i <= n; i++) {
                dp[i] = Math.max(dp[i-3] + stair[i] + stair[i-1], dp[i-2] + stair[i]);
            }
        }

        System.out.println(dp[n]);
    }
}
