package Bronze;

import java.io.*;

public class BOJ_2440 {
    //문제 이름: 별찍기 - 3
    //난이도: bronze 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            int space = i;
            int star = N-i;
            for(int j=0; j<star; j++){
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}
