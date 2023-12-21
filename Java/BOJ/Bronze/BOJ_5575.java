package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_5575 {
    //문제 이름: 타임 카드
    //난이도: bronze 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i < 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int s1 = Integer.parseInt(st.nextToken());

            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int s2 = Integer.parseInt(st.nextToken());

            int resultH = h2-h1;
            int resultM = 0;
            int resultS = 0;

            if (m2-m1 < 0) {
                resultH-=1;
                resultM = 60+m2-m1;
            } else{
                resultM = m2-m1;
            }

            if (s2-s1<0){
                if (resultM == 0) {
                    resultH-=1;
                    resultM=59;
                    resultS=60+s2-s1;
                } else{
                    resultM-=1;
                    resultS=60+s2-s1;
                }
            } else{
                resultS = s2-s1;
            }
            System.out.println(resultH + " " + resultM + " " + resultS);
        }
    }
}
