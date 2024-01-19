package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1620 {
    //문제 이름: 나는야 포켓몬 마스터 이다솜
    //난이도: silver 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<Integer, String> map = new HashMap<>();
        HashMap<String, Integer> reMap = new HashMap<>();
        for(int i = 0; i < N; i++){
            String str = br.readLine();
            map.put(i+1, str);
            reMap.put(str, i+1);
        }
        for(int i = 0; i < M; i++){
            String temp = br.readLine();
            try{
                int a = Integer.parseInt(temp);
                System.out.println(map.get(a));
            } catch (Exception e){
                int a = 0;
                System.out.println(reMap.get(temp));
            }
        }
    }
}
