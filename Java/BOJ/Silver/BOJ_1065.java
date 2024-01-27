package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1065 {
    // 문제 이름: 한수
    // 난이도: silver 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 1; i < N + 1; i++) {
            if (i < 100) {
                count++;
            } else if (i==1000) {
                continue;
            } else {
                int a = i/100;
                int b = (i%100)/10;
                int c = (i%10);

                if((b-a) == (c-b)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
