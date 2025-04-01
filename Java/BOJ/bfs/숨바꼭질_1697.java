package boj.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class 숨바꼭질_1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] num = new int[100001];
        num[n] = 1;

        bfs(n, k, num);
    }

    public static void bfs(int n, int k, int[] num) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(n);

        while (!queue.isEmpty()) {
            int poll = queue.poll();
            if (poll == k) {
                System.out.println(num[k] - 1);
                break;
            }
            if (poll - 1 >= 0 && num[poll - 1] == 0) {
                num[poll - 1] = num[poll] + 1;
                queue.offer(poll - 1);
            }
            if (poll + 1 <= 100000 && num[poll + 1] == 0) {
                num[poll + 1] = num[poll] + 1;
                queue.offer(poll + 1);
            }
            if (poll * 2 <= 100000 && num[poll * 2] == 0) {
                num[poll * 2] = num[poll] + 1;
                queue.offer(poll * 2);
            }
        }
    }
}
