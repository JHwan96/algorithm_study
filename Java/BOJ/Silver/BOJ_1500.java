package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1500 {
    // 문제 이름: 최대 곱
    // 난이도: silver 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int num = S/K;
        int mod = S%K;
        int cnt = 0;
        long result = 1;
        for(int i = 0; i < K; i++){
            if(cnt < mod){
                result *= (num + 1);
                cnt++;
            } else {
                result *= num;
            }
        }
        System.out.println(result);
    }
}
