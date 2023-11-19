package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2744 {
    // 문제 이름: 대소문자 바꾸기
    // 난이도: bronze 5
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] charList =str.toCharArray();
        for(int i=0; i<str.length(); i++){
            if(charList[i] > 96){
                charList[i] -= 32;
            } else{
                charList[i] += 32;
            }
        }
        System.out.println(String.valueOf(charList));
    }
}
