package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1010 {
    // 문제 이름: 다리 놓기
    // 난이도: Silver 5
    static int[][] mem = new int[30][30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            System.out.println(combination(y,x));
        }
    }

    public static int combination(int x, int y){
        if(mem[x][y] > 0){
            return mem[x][y];
        }
        else if(x==y || y == 0){
            mem[x][y] = 1;
            return mem[x][y];
        }
        else{
            mem[x][y] = combination(x-1, y-1) + combination(x-1, y);
            return mem[x][y];
        }
    }
}
