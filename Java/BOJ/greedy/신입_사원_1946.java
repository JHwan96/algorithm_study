package boj.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class 신입_사원_1946 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        List<int[]> list = new ArrayList<>();

        for(int i = 0; i < t; i++) {
            list = new ArrayList<>();
            int n = Integer.parseInt(br.readLine());
            for(int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                list.add(new int[]{a,b});
            }

            list.sort(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0]-o2[0];
                }
            });

            int count = 1;
            int temp = list.get(0)[1];
            for(int j = 1; j < list.size(); j++) {
                if(temp > list.get(j)[1]) {
                    temp = list.get(j)[1];
                    count++;
                }

            }
            System.out.println(count);
        }





    }
}
