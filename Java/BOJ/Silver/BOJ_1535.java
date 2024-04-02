package silver;
import java.io.*;
import java.lang.*;
import java.util.*;

public class BOJ_1535 {
    // 문제 이름: 안녕
    // 난이도: silver 2
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = 99;
        int[][] dp = new int[N+1][K+1];
        int[] L = new int[N+1];
        int[] J = new int[N+1];
        int result = 0;

        for(int i = 1; i < N+1; i++){
            L[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i< N+1; i++){
            J[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i < N+1; i++){
            for(int j = 1; j < K+1; j++){
                if(L[i] <= j){
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-L[i]] + J[i]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[N][K]);
    }
}
