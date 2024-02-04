package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1735 {
    //문제 이름: 분수 합
    // 난이도: silver 3
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int b1 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        int gcd = gcd(a2, b2);

        int lc = b2*a2/gcd;
        int resultA=0;
        resultA += (b1*(lc/b2));
        resultA += (a1*(lc/a2));
        int resultGcd = gcd(resultA, lc);
        System.out.println(resultA/resultGcd + " " + lc/resultGcd);
    }
    public static int gcd(int a, int b){
        int gcd = 1;
        int tempA = a;
        int tempB = b;
        int tempC = 0;
        if(b > a){
            tempA = b;
            tempB = a;
        }
        while(true){
            tempC = tempA % tempB;
            tempA = tempB;
            tempB = tempC;
            if(tempC == 0){
                gcd = tempA;
                break;
            }
        }
        return gcd;
    }
}
