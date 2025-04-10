package boj.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 섬의_개수_4963 {
    static int[] dx = new int[]{0, 1, 0, -1, 1, 1, -1, -1};
    static int[] dy = new int[]{1, 0, -1, 0, 1, -1, 1, -1};
    static int h;
    static int w;
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                break;
            }
            map = new int[h][w];
            visited = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (!visited[i][j] && map[i][j] == 1) {
                        dfs(i, j);
                        count += 1;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void dfs(int i, int j) {
        Stack<int[]> stack = new Stack<>();
        stack.add(new int[]{i, j});
        while (!stack.isEmpty()) {
            int[] pop = stack.pop();
            for (int a = 0; a < 8; a++) {
                int nx = pop[0] + dx[a];
                int ny = pop[1] + dy[a];
                if(nx >= 0 && nx < h && ny >= 0 && ny < w) {
                    if (!visited[nx][ny] && map[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        stack.push(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
