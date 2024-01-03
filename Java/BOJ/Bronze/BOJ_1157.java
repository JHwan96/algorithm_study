package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1157 {
    //문제 이름: 단어 공부
    //문제 난이도: Bronze 1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();
        char[] chars = str.toCharArray();
        int ALPHABET_TO_NUM = 65;
        int[] alphaList = new int[26];
        int max = -1;
        int maxIdx = -1;
        int count = 0;
        Boolean check = false;


        for(int i = 0; i < str.length(); i++){
            int idx = (int)chars[i]-ALPHABET_TO_NUM;
            alphaList[idx]++;
        }
        for (int i=0; i < 26; i++) {
            if(alphaList[i] > max){
                maxIdx=i;
                max = alphaList[i];
//                count=1;
                check = false;
            } else if(alphaList[i] == max){
                check = true;
            }
        }
        if (check==true){
            System.out.println("?");
        } else{
            char result = (char)(maxIdx+ALPHABET_TO_NUM);
            System.out.println(result);
        }
    }
}
