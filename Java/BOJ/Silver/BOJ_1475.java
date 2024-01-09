package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1475 {
    // 문제 이름: 방 번호
    // 난이도: silver 5
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        int[] numList = new int[10];
        for (int i = 0; i < chars.length; i++) {
             int a = Character.getNumericValue(chars[i]);
            numList[a]++;
        }
        int result = -1;
        int sixNine = 0;
        for (int i=0; i<10; i++) {
            int temp = -1;

            if(i == 6){
                sixNine+=numList[i];
            }else if(i==9){
                sixNine+=numList[i];
                if(sixNine == 0){
                    temp = 0;
                }else if(sixNine % 2 == 0) {
                    temp = sixNine / 2 ;
                }else if(sixNine % 2 ==  1){
                    temp = sixNine / 2 + 1;
                }
            } else{
                temp = numList[i];
            }
            if(result < temp){
                result = temp;
            }

        }
        System.out.println(result);
    }
}
