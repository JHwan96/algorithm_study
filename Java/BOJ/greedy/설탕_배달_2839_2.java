package boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 설탕_배달_2839_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        while (n >= 0) {
            if (n % 5 == 0) {
                count += n / 5;
                System.out.println(count);
                return;
            } else {
                count += 1;
                n -= 3;
            }
        }
        System.out.println(-1);
    }
}
