package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2754 {
    // 문제 이름: 학점계산
    // 난이도: bronze 5
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str.charAt(0) == 'A'){
            if(str.charAt(1) == '+'){
                System.out.println("4.3");
            }else if(str.charAt(1)=='0'){
                System.out.println("4.0");
            }else{
                System.out.println("3.7");
            }
        }
        else if(str.charAt(0) == 'B'){
            if(str.charAt(1) == '+'){
                System.out.println("3.3");
            }else if(str.charAt(1)=='0'){
                System.out.println("3.0");
            }else{
                System.out.println("2.7");
            }
        }else if(str.charAt(0) == 'C'){
            if(str.charAt(1) == '+'){
                System.out.println("2.3");
            }else if(str.charAt(1)=='0'){
                System.out.println("2.0");
            }else{
                System.out.println("1.7");
            }
        }else if(str.charAt(0) == 'D'){
            if(str.charAt(1) == '+'){
                System.out.println("1.3");
            }else if(str.charAt(1)=='0'){
                System.out.println("1.0");
            }else{
                System.out.println("0.7");
            }
        }else{
            System.out.println("0.0");
        }
    }
}
