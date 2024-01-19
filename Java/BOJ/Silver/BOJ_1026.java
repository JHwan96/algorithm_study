package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class BOJ_1026 {
    // 문제 이름: 보물
    // 난이도: silver 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            A.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            B.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> collectB = B.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> collectA = A.stream().sorted().collect(Collectors.toList());
        int result = 0;
        for(int i=0; i<N; i++){
            result += (collectB.get(i) * collectA.get(i));
        }
        System.out.println(result);
    }
}
