package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1436 {
    // 문제이름: 영화감독 숌
    // 난이도: silver 5
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 666;
        int count = 1;

        while(true) {
            if(count == N){
                System.out.println(num);
                break;
            }
            num++;
            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }
    }
}
