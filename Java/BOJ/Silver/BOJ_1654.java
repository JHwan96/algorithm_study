package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class BOJ_1654 {
    //문제 이름: 랜선 자르기
    //난이도: silver 2
    static List<Long> longArr = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        for (int i = 0; i < K; i++) {
            longArr.add(Long.parseLong(br.readLine()));
        }
        longArr = longArr.stream().sorted().collect(Collectors.toList());
        long min = 1;
        long max = longArr.get(K - 1);
        long middle = (min + max) / 2;
        while (min <= max) {
            int count = 0;
            for (int i = 0; i < K; i++) {
                count+=longArr.get(i)/middle;
            }
            if(count < N){
                max = middle-1;
            } else {
                min = middle+1;
            }
            middle = (min + max) / 2;
        }
        System.out.println(middle);

    }

}
