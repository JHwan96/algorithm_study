package boj.backtracking;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class N과_M_9_15663 {
    static int[] arr;
    static int N;
    static int M;
    static List<Integer> list = new ArrayList<>();
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        visited =new boolean[N];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        recur(0);

    }


    static void recur(int count) {
        if(count == M) {
            for(int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
            return;
        }
        int before = 0;
        for(int i = 0; i < N; i++) {
            if(visited[i]) continue;
            if(before != arr[i]) {
                visited[i] = true;
                list.add(arr[i]);
                before = arr[i];
                recur(count + 1);
                list.remove(list.size()-1);
                visited[i] = false;
            }
        }


    }

}
