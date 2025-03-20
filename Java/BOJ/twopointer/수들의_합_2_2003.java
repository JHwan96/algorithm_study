package boj.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 수들의_합_2_2003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] num = new int[n+1];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int count = 0;
        int start = 0;
        int end = 0;
        int result = 0;
        while (start <= n && end <= n) {
            if (result == m) {
                count++;
            }
            if (result <= m) {
                result += num[end++];
            } else {
                result -= num[start++];
            }
        }
        System.out.println(count);

    }

}
