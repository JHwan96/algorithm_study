package boj.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;

public class 트리의_부모_찾기_2_11725 {
    static int n;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean[] visited;
    static int[] parent;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n+1; i++){
            graph.add(new ArrayList<>());
        }

        visited = new boolean[n+1];
        parent = new int[n+1];
        StringTokenizer st;

        for(int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
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
            ArrayList<Integer> integers = graph.get(poll);
            for(int a : integers){
                if(!visited[a]){
                    visited[a] = true;
                    parent[a] = poll;
                    queue.offer(a);
                }
            }
        }
    }
}
