package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1149 {
    //이름: RGB 거리
    //난이도: silver 1
    public static void main(String[] args) throws IOException {
        // 1 2 3 4 5 ... N
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] mz = new int[N + 1][3];
        int[][] arr = new int[N][3];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < N + 1; i++) {
            mz[i][0] = Math.min(mz[i - 1][1], mz[i - 1][2]) + arr[i - 1][0];
            mz[i][1] = Math.min(mz[i - 1][0], mz[i - 1][2]) + arr[i - 1][1];
            mz[i][2] = Math.min(mz[i - 1][0], mz[i - 1][1]) + arr[i - 1][2];
        }
        System.out.println(Math.min(mz[N][0], Math.min(mz[N][1], mz[N][2])));
    }
}
