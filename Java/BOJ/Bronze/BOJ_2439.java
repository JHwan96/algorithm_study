package Bronze;

import java.io.*;

public class BOJ_2439 {
    //문제 이름: 별 찍기 -2
    //난이도: bronze 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BufferedWriter bor = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=1;i<N+1;i++){
            int star = i;
            int space = N-i;
            for(int j=0;j<space;j++){
                bor.write(" ");
            }
            for(int j=0;j<star;j++){
                bor.write("*");
            }
            bor.write("\n");
        }
        bor.flush();
        bor.close();
    }
}
