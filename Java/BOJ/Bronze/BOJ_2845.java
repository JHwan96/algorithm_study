package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2845 {
    //문제 이름: 파티가 끝나고 난 뒤
    //난이도: bronze 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int count = L*P;

        st = new StringTokenizer(br.readLine());
        int[] article = new int[5];

        int i = 0;
        while(st.hasMoreTokens()){
            int token = Integer.parseInt(st.nextToken());
            article[i++]=token;
        }
        for(int a : article){
            System.out.print((a-count)+" ");
        }
    }

}
