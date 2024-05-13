package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2072 {
	// 문제이름: 홀수만 더하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int result = 0;
            for (int j = 0; j < 10; j++) {
                int tempInt = Integer.parseInt(st.nextToken());
                if (tempInt % 2 != 0) {
                    result += tempInt;
                }
            }
            System.out.println("#"+(i+1)+" "+result);
        }
    }
}
