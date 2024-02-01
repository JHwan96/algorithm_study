package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1463 {
    // 문제 이름: 1로 만드기
    // 난이도: silver 3
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] list_ = new int[N+1];
        list_[0]=list_[1]=0;
        for(int i = 2; i < N+1; i++) {
            list_[i] = list_[i - 1] + 1;
            if (i % 3 == 0) {
                list_[i] = Math.min(list_[i], list_[i / 3] + 1);
            }
            if (i % 2 == 0) {
                list_[i] = Math.min(list_[i], list_[i / 2] + 1);
            }
        }
        System.out.println(list_[N]);
    }
}
