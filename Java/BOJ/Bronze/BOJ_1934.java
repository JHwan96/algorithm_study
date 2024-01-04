package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1934 {
    // 문제 이름: 최소공배수
    // 난이도: Bronze 1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(LCM(a,b));
        }
    }

    public static int GCD(int a , int b){
        if(b == 0){
            return a;
        }
        return GCD(b, a%b);
    }

    public static int LCM(int a, int b){
        return a*b / GCD(a,b);
    }
}
