package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_2304 {
    // 문제 이름: 창고 다각형
    // 난이도: silver 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] block = new int[1001];
        int[] idx = new int[n];
        StringTokenizer st;
        int maxIdx = -1;
        int maxLength = -1;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int pos = Integer.parseInt(st.nextToken());
            int size = Integer.parseInt(st.nextToken());
            block[pos] = size;
            idx[i] = pos;
            if(maxLength < size){
                maxLength = size;
                maxIdx = pos;
            }
        }
        Arrays.sort(idx);
        int start = idx[0];
        int last = idx[n-1];
        int result=0;
        int length=-1;
        int cnt = 0;
        for(int i = start; i < maxIdx; i++){
            if(length < block[i]){
                result += length*cnt;
                cnt = 1;
                length = block[i];
            } else {
                cnt++;
            }
            if(i == maxIdx-1){
                result += length*cnt;
            }
        }
        length=-1;
        cnt = 0;
        for(int i = last; i > maxIdx; i--){
            if(length < block[i]){
                result += length * cnt;
                cnt = 1;
                length = block[i];
            } else {
                cnt++;
            }
            if(i == maxIdx+1){
                result += length * cnt;
            }
        }
        System.out.println(maxLength+result);
    }
}
