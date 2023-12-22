package Bronze;

import java.io.*;

public class BOJ_2446 {
    //문제 이름: 별찍기-9
    //문제 난이도: Bronze 3
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = N; i > 0; i--){
            for(int j=0; j < N-i; j++){
                bw.append(" ");
            }
            for(int j=0; j < (2*i)-1; j++){
                bw.append("*");
            }
            bw.append("\n");
        }
        for (int i = 1; i < N; i++){
            for(int j=1; j < N-i; j++){
                bw.append(" ");
            }
            for(int j=0; j < (2*i)+1; j++){
                bw.append("*");
            }
            bw.append("\n");
        }
        bw.flush();

    }
}
