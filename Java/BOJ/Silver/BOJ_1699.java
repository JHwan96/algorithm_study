package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1699 {
    // 문제 이름: 제곱수의 합
    // 난이도: silver 2

    static int[] intArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        intArr = new int[N + 1];
        intArr[1] = 1;
        for (int i = 2; i < N + 1; i++) {
            int half = (int) i / 2;
            int min = Integer.MAX_VALUE;
            for (int j = 1; j*j <= i; j++) {
                if(j*j == i){
                    min = 1;
                    break;
                }
                min = Math.min(min,intArr[i-j*j]+1);
            }
            intArr[i] = min;
        }
        System.out.println(intArr[N]);
    }
}
