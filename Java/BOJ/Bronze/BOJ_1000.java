package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1000 {
    // 문제 이름 : A+B
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int i = Integer.parseInt(st.nextToken());
        int j = Integer.parseInt(st.nextToken());
        System.out.println(i+j);

    }
}
