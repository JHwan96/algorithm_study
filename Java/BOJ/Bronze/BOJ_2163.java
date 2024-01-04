package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2163 {
    // 문제 이름: 초콜릿 자르기
    // 난이도: Bronze 1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int firstCut = N-1;
        int secondCut = N * (M-1);
        System.out.println(firstCut+secondCut);
    }
}
