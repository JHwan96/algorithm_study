package boj.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 수_찾기_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < m; i ++) {
            int check = Integer.parseInt(st.nextToken());
            System.out.println(binary(num, check));
        }
    }

    public static int binary(int[] num, int check) {
        int start = 0;
        int end = num.length-1;
        while(start <= end) {
            int middle = (start + end)/2;
            if (num[middle] == check) {
                return 1;
            } else if (num[middle] > check) {
                end = middle-1;
            } else {
                start = middle+1;
            }
        }
        return 0;
    }
}
