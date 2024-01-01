package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_1159 {
    // 문제이름: 농구 경기
    // 난이도: Bronze 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<String> list_ = new ArrayList<>();
        int[] alpha = new int[26];
        int CHAR_TO_INT = 97;
        int count = 0;
        String result = "";

        for (int i = 0; i < N; i++) {
            list_.add(br.readLine());
        }
        for (int i = 0; i < N; i++) {
            String str = list_.get(i);
            char first = str.charAt(0);
            int idx = first - CHAR_TO_INT;
            alpha[idx] += 1;
        }

        for (int i = 0; i < 26; i++) {
            int temp = alpha[i];

            if (temp >= 5) {
                count++;
                char tempChar = (char) (i + CHAR_TO_INT);
                String tempStr = String.valueOf(tempChar);
                result += tempStr;
            }
        }
        if (count == 0) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(result);
        }
    }
}
