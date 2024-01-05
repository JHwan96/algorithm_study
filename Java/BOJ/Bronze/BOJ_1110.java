package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1110 {
    //문제 이름: 더하기 사이클
    //문제 난이도: Bronze 1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int checkNumber = N;
        int count = 0;

        if(N == 0){
            System.out.println(1);
            return;
        }

        while(true) {
            if (N < 10) {
                N = N * 11;
            } else if (N >= 10) {
                int sum = (N / 10) + (N % 10);
                int newN = (N % 10)*10 + sum % 10;
                N = newN;
            }
            count++;
            if(N == checkNumber){
                System.out.println(count);
                break;
            }
        }


    }
}
