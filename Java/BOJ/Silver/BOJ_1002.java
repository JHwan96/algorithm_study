package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1002 {
    //문제 이름: 터렛
    //난이도: silver 3
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int distance_pow = (int) (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
            int dis = (int) Math.pow((r2 + r1), 2);
            int minusDis = (int) Math.pow(r2 - r1,2);

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
                continue;
            } else if (x1 == x2 && y1 == y2 && r1 != r2) {
                System.out.println(0);
                continue;
            }

            if (distance_pow > dis) {
                System.out.println(0);
            } else if (distance_pow < minusDis) {
                System.out.println(0);
            } else if (distance_pow == dis) {
                System.out.println(1);
            } else if (distance_pow == minusDis) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}
