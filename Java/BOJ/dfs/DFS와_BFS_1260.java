package boj.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class DFS와_BFS_1260 {
    /**
     * DFS와 BFS
     * 1. BFS, DFS 메서드를 하나씩 만들기
     * 2. V+E 두 번씩
     * 3.
     */
    static int[][] graph;
    static boolean[] visited;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        graph = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        dfs(v);
        visited = new boolean[n + 1];
        System.out.println();
        bfs(v);
    }

    public static void bfs(int start) {
        Deque<Integer> queue = new ArrayDeque();
        queue.add(start);
        visited[start] = true;
        StringBuilder sb = new StringBuilder();

        while (!queue.isEmpty()) {
            int v = queue.pop();
            sb.append(v);
            sb.append(" ");

            for (int i = 1; i < n + 1; i++) {
                if (graph[v][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
        System.out.println(sb.toString().trim());
    }

    public static void dfs(int start) {
        System.out.print(start);
        visited[start] = true;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i] && graph[start][i] == 1) {
                System.out.print(" ");
                dfs(i);
            }
        }
    }
}
