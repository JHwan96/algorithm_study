package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1978 {
    // 문제 이름: 소수 찾기
    // 난이도: Bronze 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;

        while(st.hasMoreTokens()){
            int temp = Integer.parseInt(st.nextToken());
            if (temp == 1) continue;
            if (temp == 2) {
                result += 1;
                continue;
            }
            for(int i = 2; i < temp; i++){
                if(temp % i == 0){
                    break;
                } else{
                    if(i == temp-1)
                        result+=1;
                }

            }
        }
        System.out.println(result);
    }
}
