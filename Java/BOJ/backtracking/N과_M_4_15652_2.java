package boj.backtracking;

import java.io.*;
import java.util.*;

public class N과_M_4_15652_2 {
    static int[] result;
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        result = new int[M+1];

        recur(0);

    }

    public static void recur(int count) {
        if(count == M) {
            for(int i = 0; i < M; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 1; i < N+1; i++){
            if(count == 0 || i >= result[count-1]){
                result[count] = i;
                recur(count+1);
            }
        }
    }
}
