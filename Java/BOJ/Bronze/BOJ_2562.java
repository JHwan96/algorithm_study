package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2562 {
    // 문제 이름: 최댓값
    // 문제 난이도: Bronze 3
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int count = 0;
        for(int i = 0; i < 9; i++){
            int temp = Integer.parseInt(br.readLine());
            if(result < temp){
                result=temp;
                count=(i+1);
            }
        }
        System.out.println(result);
        System.out.println(count);
    }
}
