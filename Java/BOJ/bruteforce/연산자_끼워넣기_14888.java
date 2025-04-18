package boj.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 연산자_끼워넣기_14888 {
    static int n;
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int[] operator;
    static int[] number;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        number = new int[n];
        operator = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        recur(number[0], 1);
        System.out.println(max);
        System.out.println(min);

    }

    public static void recur(int num, int index) {
        if (index == n) {
            max = Math.max(max, num);
            min = Math.min(min, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;
                switch (i) {
                    case 0:
                        recur(num + number[index], index + 1);
                        break;
                    case 1:
                        recur(num - number[index], index + 1);
                        break;
                    case 2:
                        recur(num * number[index], index + 1);
                        break;
                    case 3:
                        recur(num / number[index], index + 1);
                        break;
                }
                operator[i]++;
            }
        }
    }

}
