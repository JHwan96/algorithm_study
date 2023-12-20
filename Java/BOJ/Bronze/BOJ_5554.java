package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5554 {
    //문제 이름: 심부름 가는 길
    //난이도: bronze 4
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in ));
        int home=Integer.parseInt(br.readLine());
        int school=Integer.parseInt(br.readLine());
        int academy=Integer.parseInt(br.readLine());
        int toHome=Integer.parseInt(br.readLine());
        int time = home+school+toHome+academy;
        System.out.println((time)/60);
        System.out.println((time)%60);
    }
}
