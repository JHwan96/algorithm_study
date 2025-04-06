package boj.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 연구소_14502 {
    static int[] dx = new int[]{0, 1, 0, -1};
    static int[] dy = new int[]{1, 0, -1, 0};
    static int[][] copyMap;
    static int n;
    static int m;
    static int result = Integer.MIN_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        recur(0, map);
        System.out.println(result);
    }

    // map 복사
    public static int[][] copy(int[][] map) {
        int[][] copying = new int[n][];
        for (int i = 0; i < n; i++) {
            copying[i] = map[i].clone();
        }
        return copying;
    }

    // 벽 3개 -> 바이러스 채우기 -> 최대 안전지역 값 구하기
    public static void recur(int count, int[][] map) {
        if (count == 3) {
            copyMap = copy(map);
            virus();
            checkMaxSize();
            return;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    map[i][j] = 1;
                    recur(count + 1, map);
                    map[i][j] = 0;
                }
            }
        }
    }

    public static void checkMaxSize() {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (copyMap[i][j] == 0) {
                    temp += 1;
                }
            }
        }
        result = Math.max(temp, result);
    }

    public static void virus() {
        Deque<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (copyMap[i][j] == 2) {
                    queue.add(new int[]{i, j});
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = poll[0] + dx[i];
                int ny = poll[1] + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (copyMap[nx][ny] == 0) {
                        copyMap[nx][ny] = 2;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
    }
}
