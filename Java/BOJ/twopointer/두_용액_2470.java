package boj.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 두_용액_2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);

        int result = Integer.MAX_VALUE;
        int start = 0;
        int end = num.length - 1;
        int[] ans = new int[2];
        while (start < end) {
            int sum = num[start] + num[end];
            int absSum = Math.abs(sum);
            result = Math.min(result, absSum);
            if (result == absSum) {
                ans[0] = num[start];
                ans[1] = num[end];
            }
            if (sum > 0) end--;
            else start++;
        }
        System.out.println(ans[0] + " " + ans[1]);
    }
}
