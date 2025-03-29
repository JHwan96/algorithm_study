package boj.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로_탐색_2178 {
    static int[] dx = new int[] {0, -1, 0, 1};
    static int[] dy = new int[] {1, 0, -1, 0};
    static int[][] map;
    static int[][] visited;
    static int n;
    static int m;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n+1][m+1];
        visited = new int[n+1][m+1];

        for(int i = 1; i < n+1; i++) {
            String str = br.readLine();
            for(int j = 1; j < m+1; j++) {
                map[i][j] = Integer.parseInt(String.valueOf(str.charAt(j-1)));
            }
        }

        bfs(1,1);

    }

    public static void bfs (int x , int y) {
        Deque<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,y});
        visited[x][y] = 1;

        while(!queue.isEmpty()) {
            int[] poll = queue.poll();
            if(poll[0] == n && poll[1] == m){
                break;
            }
            for(int i = 0; i < 4; i++) {
                int nx = poll[0] + dx[i];
                int ny = poll[1] + dy[i];
                if(nx >= 1 && nx <= n && ny >= 1 && ny <= m) {
                    if(map[nx][ny] != 0 && visited[nx][ny] == 0) {
                        queue.offer(new int[]{nx, ny});
                        visited[nx][ny] = visited[poll[0]][poll[1]] + 1;
                    }
                }
            }
        }
        System.out.println(visited[n][m]);
    }
}
