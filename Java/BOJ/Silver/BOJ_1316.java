package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1316 {
    //문제 이름: 그룹 단어 체커
    //난이도: silver 5
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int CONVERT_ALPHA = 97; //(char)97: a
        int result = 0;

        // 단어당 확인
        for(int i=0; i<N; i++){
            boolean flag = false;
            int[] alphaList = new int[26];
            char[] chars = br.readLine().toCharArray();
            int length = chars.length;
            for(int a = 0; a < chars.length; a++){
                if(a != 0){
                    if(chars[a-1] == chars[a]){
                        if(a == length-1){
                            result++;
                        } else {
                            continue;
                        }
                    }
                }
                int idx = chars[a]-CONVERT_ALPHA;
                if (alphaList[idx] > 0){
                    break;
                } else{
                    alphaList[idx]++;
                }
                if(a == length-1){
                    result++;
                }
            }
        }
        System.out.println(result);

    }
}
