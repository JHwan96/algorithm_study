package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BOJ_2588 {
    //문제 이름: 곱셈
    //난이도: Bronze 3
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println(a*((b%100)%10));
        System.out.println(a*((b%100)/10));
        System.out.println(a*(b/100));
        System.out.println(a*b);
    }
}
