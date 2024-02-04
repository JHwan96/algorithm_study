package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;


public class BOJ_1302 {
    //문제 이름: 베스트 셀러
    //난이도: silver 4
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            if(map.containsKey(str)){
                Integer integer = map.get(str);
                integer+=1;
                map.replace(str, integer);
            } else {
                map.put(str, 0);
            }
        }
        List<String> collect = map.keySet().stream().sorted().collect(Collectors.toList());
        String result = "";
        int maxIdx=-1;
        for(String a : collect){
            int temp = map.get(a);
            if(temp > maxIdx){
                maxIdx = temp;
                result = a;
            }
        }
        System.out.println(result);

    }
}
