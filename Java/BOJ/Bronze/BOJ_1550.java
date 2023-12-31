package Bronze;

import java.io.*;

public class BOJ_1550 {
    //문제 이름: 16진수
    //난이도: Bronze 2
    public static void main(String[] args ) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hex = br.readLine();
        int result = Integer.parseInt(hex, 16);
        System.out.println(result);
    }

}
