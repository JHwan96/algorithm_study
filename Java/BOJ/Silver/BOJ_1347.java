package silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ_1347 {
    // 문제 이름: 미로 만들기
    // 난이도: silver 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split("");
        int[][] maze = new int[101][101];
        int dx[] = {0, -1, 0, 1};
        int dy[] = {1, 0, -1, 0};
        int pos = 0;
        int x = 50;
        int y = 50;
        maze[50][50] = 1;
        int minX = 50;
        int maxX = 50;
        int minY = 50;
        int maxY = 50;


        for (int i = 0; i < split.length; i++) {
            switch (split[i]) {
                case "R":
                    pos = (pos + 1) % 4;
                    break;
                case "L":
                    pos = pos - 1;
                    if (pos < 0) {
                        pos = 3;
                    }
                    break;
                case "F":

                    y += dy[pos];
                    x += dx[pos];
                    minX = Math.min(minX, x);
                    maxX = Math.max(maxX, x);
                    minY = Math.min(minY, y);
                    maxY = Math.max(maxY, y);

                    maze[y][x] = 1;
                    break;
            }
        }
        BufferedWriter wr = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = minY; i <= maxY; i++) {
            for (int j = minX; j <= maxX; j++) {
                if(maze[i][j] == 1){
                    wr.write(".");
                } else {
                    wr.write("#");
                }
            }
            wr.write("\n");
        }
        wr.flush();
    }
}
