package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2739 {
    // 문제 이름: 구구단
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            for (int i = 0; i < 9; i++){
                System.out.println(N + " * " + (i+1) + " = " + (N * (i+1)));
            }
        }
}
