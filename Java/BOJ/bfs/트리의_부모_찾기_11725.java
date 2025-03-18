package boj.bfs;

import java.io.*;
import java.util.*;

public class 트리의_부모_찾기_11725 {
    // 메모리 부족 문제 발생
    static int n;
    static int[][] graph;
    static boolean[] visited;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n+1][n+1];
        visited = new boolean[n+1];
        parent = new int[n+1];
        StringTokenizer st;

        for(int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        bfs(1);
        for(int i = 2; i < n+1; i++){
            System.out.println(parent[i]);
        }
    }

    public static void bfs(int start) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(start);
        visited[start] = true;
        while(!queue.isEmpty()){
            int poll = queue.poll();
            for(int i = 1; i < n+1; i++){
                if(graph[poll][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    parent[i] = poll;
                    queue.offer(i);
                }
            }
        }
    }
}
