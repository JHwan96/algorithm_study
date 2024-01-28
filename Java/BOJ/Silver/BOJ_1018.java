package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1018 {
    // 문제 이름: 체스판 다시 칠하기
    // 난이도: silver 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] strArray = new String[N];
        int result = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++){
            String str = br.readLine();
            strArray[i] = str;
        }

        for(int i = 0; i < N-7; i++){
            for(int j = 0; j < M-7; j++){
                for(int k = 0; k < 2; k++) {
                    char flag;
                    int count = 0;
                    if(k == 0) {
                        flag = 'W';
                    } else {
                        flag = 'B';
                    }
                    for (int x = 0; x < 8; x++) {
                        String tempStr = strArray[x + i];
                        for (int y = 0; y < 8; y++) {
                            if(tempStr.charAt(j + y) != flag){
                                count++;
                            }
                            if(flag == 'W') {
                                flag = 'B';
                            } else flag = 'W';
                        }
                        if(flag == 'W') {
                            flag = 'B';
                        } else flag = 'W';
                    }
                    result = Math.min(count, result);
                }
            }
        }
        System.out.println(result);
    }
}
