package boj.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class N_Queen_9663 {
    // 각 줄에 1개씩
    // map에 아닌 것들은 미리 칠할까?


    static int n;
    static int result = 0;
    static int[] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n];
        recur(0);
        System.out.println(result);
    }

    public static void recur(int count) {
        if (count == n) {
            result += 1;
            return;
        }
        for (int i = 0; i < n; i++) {
            map[count] = i;
            if (possible(count)) {
                recur(count + 1);
            }
        }
    }

    public static boolean possible(int count) {
        for (int i = 0; i < count; i++) {
            if (map[count] == map[i]) {
                return false;
            }

            if (Math.abs(count-i) == Math.abs(map[count]-map[i])){
                return false;
            }
        }
        return true;
    }
}
