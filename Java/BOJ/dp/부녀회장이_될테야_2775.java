package boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 부녀회장이_될테야_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] dp = new int[15][15];

        for(int i = 1; i <= 14; i++) {
            dp[0][i] = i;
        }

        for(int i = 1; i <= 14; i++) {
            for(int j = 1; j <= 14; j++) {
                for(int k = 1; k <= j; k++ ){
                    dp[i][j] += dp[i-1][k];
                }
            }
        }

        for(int i = 0 ; i < t; i++) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            System.out.println(dp[a][b]);
        }
    }
}
