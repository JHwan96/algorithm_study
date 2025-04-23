package boj.backtracking;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class N과_M_8_15657 {
    static List<Integer> list = new ArrayList<>();
    static int M;
    static int N;
    static int[] array;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        array = new int[N];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0 ; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);

        recur(0,0);


    }

    static void recur(int count, int num) {
        if(count == M) {
            for(int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
            return;
        }
        for(int i = num; i < N; i++) {
            list.add(array[i]);
            recur(count+1, i);
            list.remove(list.size()-1);
        }
    }

}
