package boj.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 집합_11723 {
    static Set<Integer> list = new HashSet<>();
    static StringTokenizer st;
    static StringBuffer sb = new StringBuffer();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String operand = st.nextToken();
            operand(operand);
        }
        System.out.println(sb.toString());
    }

    public static void operand(String operand) {
        switch (operand) {
            case "add":
                list.add(Integer.parseInt(st.nextToken()));
                break;
            case "remove":
                list.remove(Integer.parseInt(st.nextToken()));
                break;
            case "check":
                if(list.contains(Integer.parseInt(st.nextToken()))) {
                    sb.append(1);
                } else {
                    sb.append(0);
                }
                sb.append("\n");
                break;
            case "toggle":
                int input = Integer.parseInt(st.nextToken());
                if (list.contains(input)) {
                    list.remove(input);
                } else {
                    list.add(input);
                }
                break;
            case "empty":
                list.clear();
                break;
            case "all":
                list = new HashSet<>();
                for (int a = 1; a <= 20; a++) {
                    list.add(a);
                }
        }
    }
}
