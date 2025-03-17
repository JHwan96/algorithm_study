package boj.dfs;

import java.util.*;
import java.lang.*;
import java.io.*;

public class 바이러스_2606
{

    static int n;
    static int[][] graph;
    static boolean[] visited;
    static int count = 0;

    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        graph = new int[n+1][n+1];
        visited = new boolean[n+1];

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        visited[1] = true;
        dfs(1);

        System.out.print(count);
    }

    public static void dfs(int start) {
        if(start != 1) count+=1;
        for(int i = 1; i < n+1; i++) {
            if(!visited[i] && graph[start][i] == 1) {
                visited[i] = true;
                dfs(i);
            }
        }
    }
}
