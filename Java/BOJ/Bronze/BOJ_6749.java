package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_6749 {
    //문제 이름: Next in line
    //난이도: bronze 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int youngest = Integer.parseInt(br.readLine());
        int middle = Integer.parseInt(br.readLine());
        System.out.println(middle+(middle-youngest));
    }
}
