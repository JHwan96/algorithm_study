package boj.twopointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 부분합_1806 {
    // 1. 처음부터 넘는 값을 구함
    // 2. 다음 포인터의 합을 구하고, 전 포인터를 뺐을 때, 조건에 부합하는지 확인
    //

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] num = new int[N+1];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }

        int count = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int result = 0;

        while(start <= N && end <= N){
            if(result >= S) {
                count = Math.min(count, end-start);
            }

            if(result < S){
                result += num[end++];
            } else {
                result -= num[start++];
            }
        }
        if(count == Integer.MAX_VALUE){
            System.out.println("0");
        } else {
            System.out.println(count);
        }
    }
}
