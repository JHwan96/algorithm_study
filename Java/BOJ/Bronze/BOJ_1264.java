package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1264 {
    //문제 이름: 모음의 개수
    // 난이도: bronze 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] vowel = {'a','e','i','o','u','A','E','I','U','O'};
        while(true) {

            String str = br.readLine();
            if(str.equals("#")){
                break;
            }
            char[] strList = str.toCharArray();
            int count = 0;
            for (char c : vowel) {
                for (char a : strList) {
                    if (a == c) count++;
                }
            }
            System.out.println(count);
        }
    }
}
