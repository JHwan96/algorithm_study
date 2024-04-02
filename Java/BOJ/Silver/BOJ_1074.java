package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class BOJ_1074 {
    // 문제 이름: Z
    // 난이도: silver 1
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int size = (int) Math.pow(2, N);
        x(size, r, c);
        System.out.println(cnt);
    }

    public static void x(int size, int r, int c) {
        if (size == 1) {
            return;
        }

        if (r < size / 2 && c < size / 2) {
            x(size / 2, r, c);
        } else if (r < size / 2 && c >= size / 2) {
            cnt += size * size / 4;
            x(size / 2, r, c - size / 2);
        } else if (r >= size / 2 && c < size / 2) {
            cnt += size * size / 4 * 2;
            x(size / 2, r - size / 2, c);
        } else {
            cnt += size * size / 4 * 3;
            x(size / 2, r - size / 2, c - size / 2);
        }
    }
}
