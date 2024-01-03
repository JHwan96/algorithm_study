package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1546 {
    // 문제 이름: 평균
    // 난이도: Bronze 1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> a = new ArrayList<>();
        for(int i = 0; i < N; i++){
            int temp = Integer.parseInt(st.nextToken());
            a.add(temp);
        }
        int max=-1;
        for(int i = 0; i < a.size();i++){
            if(a.get(i) > max){
                max = a.get(i);
            }
        }
        double sum = 0;
        for(int i = 0; i < a.size();i++){
            sum += (double)a.get(i)/max*100;
        }
        System.out.println(sum/N);
    }
}
