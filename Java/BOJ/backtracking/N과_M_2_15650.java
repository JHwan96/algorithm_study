package boj.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class N과_M_2_15650 {
    static int N;
    static int M;
    static List<Integer> result;
    static boolean[] check;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        result = new ArrayList<>();
        check = new boolean[N+1];
        recur(0);

    }

    public static void recur(int count) {
        if(count == M) {
            for(int i = 0; i < M; i++){
                System.out.print(result.get(i) + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 1; i < N+1; i++){
            if(count == 0) {
                if (!check[i]) {
                    check[i] = true;
                    result.add(i);
                    recur(count + 1);
                    check[i] = false;
                    result.remove(result.size() - 1);
                }
            } else {
                if(!check[i] && i > result.get(count-1)) {
                    check[i] = true;
                    result.add(i);
                    recur(count + 1);
                    check[i] = false;
                    result.remove(result.size() - 1);
                }
            }
        }
    }

}
