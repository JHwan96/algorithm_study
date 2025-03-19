package boj.backtracking;

import java.sql.Array;
import java.util.*;
import java.io.*;

public class N과_M_15649 {
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
            if(!check[i]){
                check[i] = true;
                result.add(i);
                recur(count+1);
                check[i] = false;
                result.remove(result.size()-1);
            }
        }
    }

}
