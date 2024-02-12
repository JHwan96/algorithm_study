package silver;

import java.io.*;
import java.util.*;

public class BOJ_1406 {
    //문제 이름: 에디터
    //난이도: silver 2
    static Stack<Character> left = new Stack<>();
    static Stack<Character> right = new Stack<>();
    static int pointer=1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] chars = str.toCharArray();
        int N = chars.length;
        pointer=N;
        for (char aChar : chars) {
            left.push(aChar);
        }

        int M = Integer.parseInt(br.readLine());
        for(int i = 0; i < M; i++) {
            String command = br.readLine();
            char c = command.charAt(0);
            switch (c) {
                case 'L':
                    if (!left.isEmpty()) {
                        right.push(left.pop());
                    }
                    break;
                case 'D':
                    if (!right.isEmpty()) {
                        left.push(right.pop());
                    }
                    break;
                case 'B':
                    if (!left.isEmpty()) {
                        left.pop();
                    }
                    break;
                case 'P':
                    char putChar = command.charAt(2);
                    left.push(putChar);
                    break;
                default:
                    break;
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(!left.isEmpty())
            right.push(left.pop());

        while(!right.isEmpty())
            bw.write(right.pop());

        bw.flush();
        bw.close();
    }
}
