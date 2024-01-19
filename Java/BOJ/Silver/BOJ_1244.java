package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1244 {
    //문제 이름: 스위치 끄고 켜기
    //난이도: silver 4
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] switchs = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            switchs[i] = Integer.parseInt(st.nextToken());
        }
        int stu = Integer.parseInt(br.readLine());

        for (int i = 0; i < stu; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            int check = 1;
            if (gender == 1) {
                for (int j = 0; j < N; j++) {
                    if (((j + 1) % num) == 0) {
                        switchs[j] = (switchs[j] == 0 ? 1 : 0);
                    }
                }
            } else {
                while (true) {
                    if (num - check == 0 || num + check > N) {
                        check--;
                        break;
                    }
                    if (switchs[num - 1 - check] != switchs[num - 1 + check]) {
                        check--;
                        break;
                    } else {
                        check++;
                    }
                }
                for (int j = num - check - 1; j < num + check; j++) {
                    switchs[j] = (switchs[j] == 0 ? 1 : 0);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i=0; i < N; i++) {
            if(count==20){
                sb.append("\n");
                count=0;
            }
            sb.append(switchs[i]);
            count++;
            if(i != N-1){
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
