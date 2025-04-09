package boj.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 토마토_7569 {
    static int[] dx = {1, 0, -1, 0, 0, 0};
    static int[] dy = {0, -1, 0, 1, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};
    static int[][][] tomato;
    static int N;
    static int M;
    static int H;
    static Deque<int[]> queue = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        tomato = new int[H][N][M];

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int k = 0; k < M; k++) {
                    tomato[i][j][k] = Integer.parseInt(st.nextToken());
                    if(tomato[i][j][k] == 1) {
                        queue.offer(new int[]{i,j,k});
                    }
                }
            }
        }

        bfs();

        int result = 1;
        for(int[][] i : tomato) {
            for(int[] j : i) {
                for(int z : j) {
                    if(z == 0) {
                        System.out.println(-1);
                        return;
                    } else if (z > 1) {
                        result = Math.max(result, z);
                    }
                }
            }
        }
        System.out.println(result-1);

    }

    public static void bfs() {
        while(!queue.isEmpty()) {
            int[] poll = queue.poll();
            // M: 5 N:3 H:2
            for (int i = 0; i < 6; i++) {
                int nz = poll[0] + dz[i];
                int ny = poll[1] + dy[i];
                int nx = poll[2] + dx[i];

                if(nx >= 0 && nx < M && ny >= 0 && ny < N && nz >= 0 && nz < H) {

                    if(tomato[nz][ny][nx] == 0) {
                        queue.offer(new int[]{nz,ny,nx});
                        tomato[nz][ny][nx] = tomato[poll[0]][poll[1]][poll[2]] + 1;
                    }
                }
            }
        }
    }
}
