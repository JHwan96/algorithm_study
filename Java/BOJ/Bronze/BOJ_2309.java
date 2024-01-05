package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BOJ_2309 {
    // 문제이름: 일곱 난쟁이
    // 난이도: Bronze 1
    public static void main(String[] args) throws IOException {
        List<Integer> nine = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 9; i++) {
            nine.add(Integer.parseInt(br.readLine()));
        }
        int sum = nine.stream().mapToInt(x->x).sum();
        int[] exc = new int[2];
        boolean flag = false;

        for(int i = 0; i < 9; i++){
            int x = nine.get(i);
            for(int j = i+1; j < 9; j++){
                int y = nine.get(j);
                if((sum-x-y) == 100){
                    exc[0] = x;
                    exc[1] = y;
                    flag=true;
                    break;
                }
            }
            if (flag){
                break;
            }
        }
        int[] idx = new int[2];
        for(int i = 0; i < 2; i++) {
            idx[i] = nine.indexOf(exc[i]);
            nine.remove(idx[i]);
        }
        Collections.sort(nine);
        for (Integer integer : nine) {
            System.out.println(integer);
        }

    }
}
