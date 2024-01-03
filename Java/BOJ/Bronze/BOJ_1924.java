package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1924 {
    // 문제 이름: 2007년
    // 난이도: Bronze 1
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int day = 0;
        String[] dayName = new String[]{"SUN","MON","TUE", "WED", "THU", "FRI", "SAT"};

        List<Integer> a = Arrays.asList(1, 3, 5, 7, 8, 10, 12);
        List<Integer> b = Arrays.asList(4, 6, 9, 11);
        List<Integer> c = Arrays.asList(2);


        for(int i = 1; i<x;i++){
            if (a.contains(i)){
                day+=31;
            } else if (b.contains(i)){
                day+=30;
            } else{
                day+=28;
            }
        }
        day+=y;
        int day_ = day % 7;
        System.out.println(dayName[day_]);
    }
}
