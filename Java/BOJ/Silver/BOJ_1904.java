package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1904 {
    //문제 이름: 01타일
    //난이도: silver 3
    static int[] arrN = new int[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arrN[1] = 1;
        arrN[2] = 2;

        if(N > 2) {
            System.out.println(getN(N));
        } else {
            System.out.println(arrN[N]);
        }
    }

    public static int getN(int N){
        if(arrN[N] == 0) {
            arrN[N] = (getN(N - 1) + getN(N - 2)) % 15746;
        }
        return arrN[N];
    }
}
