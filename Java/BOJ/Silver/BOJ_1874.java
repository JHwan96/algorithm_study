package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BOJ_1874 {
    // 문제 이름: 스택 수열
    // 난이도:  silver 2
    public static void main(String[] args) throws IOException {
        ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
        ArrayDeque<String> queue = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int number = 1;

        for (int i = 0; i < N; i++) {
            int target = Integer.parseInt(br.readLine());

            if (target < number) {
                Integer pop = stack.removeLast();
                if (pop != target) {
                    System.out.println("NO");
                    return;
                } else {
                    queue.addLast("-");
                }
            } else {
                while (true) {
                    stack.addLast(number);
                    queue.addLast("+");
                    number++;
                    if (target == number-1) {
                        stack.removeLast();
                        queue.addLast("-");
                        break;
                    }
                }
            }
        }
        for (String num : queue) {
            System.out.println(num);
        }
    }
}
