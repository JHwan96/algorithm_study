package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1182 {
    //문제 이름: 부분 수열의 합
    //난이도: silver 2
    static int N,S;
    static int[] intArr;
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        intArr = new int[N];
        for(int i = 0; i < N; i++){
            intArr[i] = Integer.parseInt(st.nextToken());
        }
        dfs(0,0);
        System.out.println(count);
    }

    static void dfs(int depth, int sum){
        if(depth == N) {
            if (sum == S) {
                count++;
            }
            return;
        }
        dfs(depth + 1, sum + intArr[depth]);
        dfs(depth + 1, sum);
    }
}
