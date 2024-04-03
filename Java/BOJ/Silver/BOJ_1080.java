package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1080 {
    // 문제 이름: 행렬
    // 난이도: silver 1
    static char[][] matrixA;
    static char[][] matrixB;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        matrixA = new char[N][M];
        matrixB = new char[N][M];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            matrixA[i] = line.toCharArray();
        }
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            matrixB[i] = line.toCharArray();
        }

        if (N < 3 || M < 3) {
            for(int i = 0; i < N; i++){
                if(String.valueOf(matrixA[i]).equals(String.valueOf(matrixB[i]))){
                    continue;
                } else {
                    System.out.println(-1);
                    return;
                }
            }
            System.out.println(0);
            return;
        }

        int result = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = 0; j < M - 2; j++) {
                if (matrixA[i][j] != matrixB[i][j]) {    // 아니면 뒤집어야함
                    changeMatrix(i, j);
                    result++;
                }
            }
        }
        for(int i = 0; i < N; i++){
            if(String.valueOf(matrixA[i]).equals(String.valueOf(matrixB[i]))){
                continue;
            } else {
                result = -1;
                break;
            }
        }
        System.out.println(result);
    }

    public static void changeMatrix(int i, int j) {
        for (int a = i; a < i + 3; a++) {
            for (int b = j; b < j + 3; b++) {
                if (matrixA[a][b] == '0') {
                    matrixA[a][b] = '1';
                } else {
                    matrixA[a][b] = '0';
                }
            }
        }
    }
}
