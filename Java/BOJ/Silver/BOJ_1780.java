package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1780 {
    // 문제 이름: 종이의 개수
    // 난이도: silver2
    static StringTokenizer st;
    static int[][] map;
    static int[] count = new int[3];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0,0,N);
        for(int count : count){
            System.out.println(count);
        }
    }
    public static void partition(int row, int col, int size){
        int color = map[row][col];
        if(check(row, col, size)){
            if(color == -1){
                count[0]++;
            } else if (color == 0){
                count[1]++;
            } else {
                count[2]++;
            }
            return;
        }

        int newSize = size/3;
        partition(row, col, newSize);
        partition(row, col+newSize, newSize);
        partition(row, col + 2*newSize, newSize);

        partition(row+newSize, col, newSize);
        partition(row+newSize, col+newSize, newSize);
        partition(row+newSize, col+2*newSize, newSize);

        partition(row+2*newSize, col, newSize);
        partition(row+2*newSize, col+newSize, newSize);
        partition(row+2*newSize, col+2*newSize, newSize);
    }

    public static boolean check(int row, int col, int size){
        int color = map[row][col];
        for(int i = row; i < row+size; i++){
            for(int j = col; j < col+size; j++){
                if(color != map[i][j])
                    return false;
            }
        }
        return true;
    }
}
