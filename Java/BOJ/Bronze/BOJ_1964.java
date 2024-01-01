package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1964 {
    // 문제 이름: 오각형, 오각형, 오각형..
    // 문제 난이도: Bronze 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 5;
        int second = 7;
        // 5 -> 5+7 -> 5+7+10 -> 5+7+10+13+16
        for(int i = 2; i < N+1; i++){
            result += second;
            second += 3;
            result %= 45678;
        }
        System.out.println(result);
    }
}
