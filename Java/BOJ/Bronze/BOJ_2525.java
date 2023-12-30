package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2525 {
    //문제 이름: 오븐 시계
    //문제 난이도: Bronze 3
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int C = Integer.parseInt(br.readLine());

        if((B+C) < 60){
            System.out.println(A+ " " + (B+C));
        } else{
            int hour = (B+C) / 60;
            int minute = (B+C) % 60;
            if((A+hour) < 24){
                System.out.println((A+hour) + " " + minute);
            } else{
                System.out.println((A+hour-24) + " " + minute);
            }
        }
    }

}
