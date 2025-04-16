package boj.sort;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 좌표_정렬하기_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<>();

        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new int[]{a,b});
        }

        Collections.sort(list, new Comparator<int[]> () {
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o1[1]-o2[1];
                }
                return o1[0]-o2[0];
            }
        });

        for(int i = 0; i < list.size(); i++) {
            int[] temp = list.get(i);
            System.out.println(temp[0] + " " + temp[1]);
        }
    }
}
