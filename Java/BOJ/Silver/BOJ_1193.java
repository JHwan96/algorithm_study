package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1193 {
    // 문제 이름: 분수찾기
    // 난이도: silver 5
    public static void main(String[] args) throws IOException {
        // 1 2 4 7 1
        int start = 1;
        int count = 1;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        boolean flag = false;
        int num = 1;
        while (true) {
            if (X < start) {
                start -= count;
                count--;
                break;
            } else if (X == start) {
                flag = true;
                break;
            }
            start += count;
            count++;
        }
        int remain = X-start;
        int temp = (1+count)-remain;

        if((flag) && (count % 2 == 1)){
            System.out.println(count+"/1");
            return;
        } else if((flag) && (count % 2 == 0)){
            System.out.println("1/"+count);
            return;
        } else if((count % 2) == 0){
            System.out.println(remain+"/"+temp);
        } else{
            System.out.println(temp+"/"+remain);
        }

    }
}
