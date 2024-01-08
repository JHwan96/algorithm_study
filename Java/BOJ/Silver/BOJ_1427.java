package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BOJ_1427 {
    // 문제이름:소트인사이드
    // 난이도: silver 5
    public static void main(String[] args) throws IOException {
        List<Integer> intList = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = br.readLine().toCharArray();
        int[] ints = new int[chars.length];

        for(int i = 0; i < chars.length; i++){
            intList.add(Character.getNumericValue(chars[i]));
        }
        intList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        StringBuilder sb = new StringBuilder();
        for(int a : intList){
            sb.append(a);
        }
        System.out.println(sb.toString());
    }
}
