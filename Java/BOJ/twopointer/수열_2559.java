package boj.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수열_2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] num = new int[n+1];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        int result = 0;

        for(int i = 0; i < m; i++){
            result += num[i];
        }
        int ther = result;

        for(int i = m; i < n; i++){
            result+=num[i];
            result-=num[i-m];
            ther = Math.max(ther, result);
        }
        System.out.println(ther);

    }
}
