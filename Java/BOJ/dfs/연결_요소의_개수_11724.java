package boj.dfs;

import java.io.*;
import java.util.*;


public class 연결_요소의_개수_11724 {
    static int n;
    static int[][] graph;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new int[n+1][n+1];
        visited = new boolean[n+1];

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        for(int i = 1; i < n+1; i++){
            if(!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
    }
    public static void dfs(int start) {
        visited[start] = true;
        for(int i = 1; i < n+1; i++){
            if(!visited[i] && graph[start][i] == 1){
                dfs(i);
            }
        }
    }
}
