package boj.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 좌표_압축_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        int[] sorted = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            num[i] = temp;
            sorted[i] = temp;
        }
        Arrays.sort(sorted);

        int rank = 0;
        for (int a : sorted) {
            if (!map.containsKey(a)) {
                map.put(a, rank++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int a : num) {
            sb.append(map.get(a));
            sb.append(" ");
        }
        System.out.println(sb.toString());

    }
}
