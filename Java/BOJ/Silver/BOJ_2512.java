package silver;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class BOJ_2512 {
    // 문제 이름: 예산
    // 난이도: silver 2
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        int m = Integer.parseInt(br.readLine());
        List<Integer> sorted = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());

        int sum = list.stream().mapToInt(a -> a).sum();
        if (sum < m){
            System.out.println(sorted.get(0));
            return;
        }

        int start = 1;
        int last = sorted.get(0);
        while(start <= last){
            int mid = (start + last) / 2;
            int budget = 0;
            for(int i = 0; i < n; i++){
                if(list.get(i) > mid){
                    budget += mid;
                } else {
                    budget += list.get(i);
                }
            }
            if(budget <= m){
                start = mid+1;
            } else {
                last = mid - 1;
            }
        }
        System.out.println(last);

    }
}
