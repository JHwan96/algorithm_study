package boj.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장_긴_증가하는_부분_수열_11053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int[] list = new int[a];
        int[] dp = new int[a];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < a; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < list.length; i++) {
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(list[j] < list[i] && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = -1;
        for(int i = 0; i < dp.length; i++) {
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);

    }
}
