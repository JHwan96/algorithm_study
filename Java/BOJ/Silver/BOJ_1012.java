package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1012 {
    //문제 이름: 유기농 배추
    //난이도: silver 2
    static int[][] graph;
    static boolean[][] visited;
    static int[] dx = {0,0,-1,1};
    static int[] dy = {1,-1,0,0};
    static int N,M,K;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int z = 0; z < T; z++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            graph = new int[M][N];
            visited = new boolean[M][N];
            count = 0;
            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                graph[a][b] = 1;
            }

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (graph[i][j] == 1 && !visited[i][j]) {
                        count++;
                        bfs(i, j);
                    }
                }
            }
            System.out.println(count);
        }
    }

    static void bfs(int x, int y){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x,y});
        while(!q.isEmpty()){
            int[] poll = q.poll();
            x = poll[0];
            y = poll[1];
            visited[x][y] = true;
            for(int i = 0; i < 4; i++){
                int nextX = x + dx[i];
                int nextY = y + dy[i];
                if (nextX >= 0 && nextX < M && nextY >= 0 && nextY < N && !visited[nextX][nextY] && graph[nextX][nextY]==1){
                    q.offer(new int[]{nextX, nextY});
                    visited[nextX][nextY]=true;
                }
            }
        }
    }
}
