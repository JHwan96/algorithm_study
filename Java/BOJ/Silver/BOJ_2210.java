package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ_2210 {
    // 문제 이름: 숫자판 점프
    // 난이도: silver 2
    static int[][] matrix = new int[5][5];
    static int[] nx = {0, 0, 1, -1};
    static int[] ny = {1, -1, 0, 0};
    static Set<String> set_ = new HashSet<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String result = "";

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i< 5; i++){
            for (int j = 0; j<5; j++){
                dfs(i,j, 1, result);
            }
        }
        System.out.println(set_.size());


    }

    static void dfs(int x, int y, int count, String result){
        if(count > 6) {
            set_.add(result);
            return;
        }
        result += matrix[x][y];
        for(int i = 0; i < 4; i++){
            int tempX = x + nx[i];
            int tempY = y + ny[i];
            if(tempX < 0 || tempX >= 5 || tempY < 0 || tempY >= 5){
                continue;
            }
            dfs(tempX, tempY, count+1, result);
        }
    }

}
