package Bronze;

import java.io.*;

public class BOJ_2442 {
    //문제 이름: 별찍기 - 5
    //난이도: Bronze 3
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int k = 0; k < N-i-1; k++){
                bw.append(" ");
            }
            for(int j = 0; j < 2*i+1; j++){
                bw.append("*");
            }

            bw.append("\n");
            bw.flush();
        }
    }
}


