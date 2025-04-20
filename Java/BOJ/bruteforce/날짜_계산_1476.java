package boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 날짜_계산_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int count = 1;
        int i = 1;
        int j = 1;
        int k = 1;
        while(true) {
            if(i == e && j == s && m == k) {
                break;
            }
            i++; j++; k++;
            count++;
            if(i > 15) {
                i %= 15;
            }
            if(j > 28) {
                j %= 28;
            }
            if(k > 19) {
                k %= 19;
            }
        }
        System.out.println(count);

    }
}
