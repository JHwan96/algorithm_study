package boj.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class 나무_자르기_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] num = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);

        bfs(num, m);
    }

    public static void bfs(int[] num, int check) {
        int start = 0;
        int end = num[num.length-1];
        while(start <= end) {
            long sum = 0;
            int middle = (start+end)/2;
            for(int i = 0; i < num.length; i++) {
                if(num[i] > middle) {
                    sum += (num[i]-middle);
                }
            }
            if(sum == check) {
                System.out.println(middle);
                return;
            } else if (sum > check) {
                start = middle+1;
            } else {
                end = middle-1;
            }
        }
        System.out.println(end);
    }
}
