package boj.sort;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 듣보잡_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        List<String> answer = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            map.put(br.readLine(), 0);
        }

        for(int i = 0; i < m; i++) {
            String temp = br.readLine();
            if(map.get(temp) != null){
                answer.add(temp);
            }
        }
        Collections.sort(answer);
        System.out.println(answer.size());
        for(String temp : answer) {
            System.out.println(temp);
        }

    }
}
