package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1003 {
    // 문제 이름: 피보나치 함수
    // 난이도: silver 3
    static int[][] arr = new int[41][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;

        for(int i = 2; i < 41; i++){
            arr[i][0] = arr[i-1][0]+arr[i-2][0];
            arr[i][1] = arr[i-1][1]+arr[i-2][1];
        }

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());

            System.out.println(arr[N][0] + " " + arr[N][1]);
        }
    }

}
