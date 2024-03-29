package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1541 {
    // 문제 이름: 잃어버린 괄호
    // 난이도: silver 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "+-", true);
        List<String> operator = new ArrayList<>();
        List<Integer> operand = new ArrayList<>();

        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            if (temp.equals("-") || temp.equals("+")) {
                operator.add(temp);
            } else {
                operand.add(Integer.parseInt(temp));
            }
        }
        int size = operator.size();
        for (int i = 0; i < size; i++) {
            if (operator.get(i).equals("+")) {
                operand.set(i, operand.get(i) + operand.get(i + 1));
                operand.remove(i + 1);
                operator.remove(i);
                size--;
                i--;
            }
        }
        while (true) {
            if (size == 0) {
                break;
            } else {
                operand.set(0, operand.get(0) - operand.get(1));
                operand.remove(1);
                operator.remove(0);
                size--;
            }
        }
        System.out.println(operand.get(0));
    }
}
