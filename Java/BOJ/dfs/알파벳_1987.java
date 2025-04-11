package boj.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 알파벳_1987 {
    static boolean[][] visited;
    static char[][] alpha;
    static Set<Character> set = new HashSet<>();
    static int[] dx = new int[]{0, 1, 0, -1};
    static int[] dy = new int[]{1, 0, -1, 0};
    static int R, C;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        visited = new boolean[R][C];
        alpha = new char[R][C];

        for (int i = 0; i < R; i++) {
            String str = br.readLine();
            for (int j = 0; j < C; j++) {
                alpha[i][j] = str.charAt(j);
            }
        }

        dfs(0, 0, 1);
        System.out.println(result);
    }

    public static void dfs(int x, int y, int count) {
        visited[x][y] = true;
        set.add(alpha[x][y]);
        result = Math.max(result, count);
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                if (!visited[nx][ny] && !set.contains(alpha[nx][ny])) {
                    set.add(alpha[nx][ny]);
                    visited[nx][ny] = true;
                    dfs(nx,ny,count+1);
                    visited[nx][ny] = false;
                    set.remove(alpha[nx][ny]);
                }
            }
        }
    }
}

