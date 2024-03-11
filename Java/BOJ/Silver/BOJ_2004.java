package silver;
import java.io.*;
import java.util.*;

public class BOJ_2004 {
    // 문제 이름: 조합 0의 개수
    // 난이도: silver 2
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int countTwo = 0;
        int countFive = 0;
        countTwo = countTwo(n) - countTwo(m) - countTwo(n-m);
        countFive = countFive(n) - countFive(m) - countFive(n-m);
        System.out.println(Math.min(countTwo, countFive));
    }

    static int countTwo(int n){
        int count = 0;
        int tempN = n;
        while(true) {
            tempN = tempN/2;
            if (tempN == 0){
                break;
            }
            count += tempN;
        }
        return count;
    }
    static int countFive(int n){
        int count = 0;
        int tempN = n;
        while(true) {
            tempN = n/5;
            if (tempN == 0){
                break;
            }
            count += tempN;
            n = tempN;
        }
        return count;
    }

}
