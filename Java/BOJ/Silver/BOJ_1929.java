package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1929 {
    // 문제 이름: 소수 구하기
    // 난이도: silver 3
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] intArr = new int[N + 1];
        List<Integer> result = new ArrayList<>();

        for (int i = 2; i < N + 1; i++) {
            if (intArr[i] == 1) {
                continue;
            }
            int temp = i;
            if (temp >= M) {
                result.add(i);
            }
            while (true) {
                if (temp > N) {
                    break;
                }
                intArr[temp] = 1;
                temp += i;
            }

        }
        for (int i : result) {
            System.out.println(i);
        }

    }
}
