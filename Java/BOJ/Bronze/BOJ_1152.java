package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1152 {
    // 문제 이름: 단어의 개수
    // 난이도: Bronze 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        while(st.hasMoreTokens()){
            st.nextToken();
            count+=1;
        }
        System.out.println(count);
    }
}
