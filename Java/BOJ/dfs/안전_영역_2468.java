package boj.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 안전_영역_2468 {
    static int n;
    static int[][] map;
    static int[] dx = new int[]{0, 1, 0, -1};
    static int[] dy = new int[]{1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        StringTokenizer st;

        int max = -1;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                int temp = Integer.parseInt(st.nextToken());
                max = Math.max(max, temp);
                map[i][j] = temp;
            }
        }

        int result=0;
        boolean[][] visited = new boolean[n][n];
        for(int i = 0; i < max; i++) {
            int count = 0;
            visited = new boolean[n][n];
            for(int j = 0; j < n; j++) {
                for(int k =0; k < n; k++) {
                    if(!visited[j][k] && map[j][k] > i) {
                        dfs(j, k, i, visited);
                        count++;
                    }
                }
            }
            result = Math.max(result, count);
        }
        System.out.println(result);
    }

    public static void dfs(int x, int y, int depth, boolean[][] visited) {
        visited[x][y] = true;

        for(int i = 0; i < 4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx < n && nx >= 0 && ny < n && ny >=0) {
                if(!visited[nx][ny] && map[nx][ny] > depth) {
                    dfs(nx,ny,depth,visited);
                }
            }
        }
    }
}
