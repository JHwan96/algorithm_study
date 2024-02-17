package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BOJ_2108 {
    //문제 이름: 통계학
    //난이도: silver 3
    static int[] countNum = new int[8001];
    static List<Integer> nList = new ArrayList<>();
    static int N = 0;
    static List<Integer> checkList = new ArrayList<>();
    static List<Integer> sortedList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(br.readLine());
            countNum[a + 4000] += 1;
            nList.add(a);
        }
        sortedList = nList.stream().sorted().collect(Collectors.toList());

        // 산술평균
        printAverage();

        //중앙값
        printMedian();

        //최빈값
        printMode();

        //범위
        printRange();
    }

    private static void printMedian() {
        int result = sortedList.get((N / 2));
        System.out.println(result);
    }

    static void printRange() {
        int result = sortedList.get(N-1) - sortedList.get(0);
        System.out.println(result);
    }

    static void printMode() {
        int count = 0;

        for (int i = 0; i < 8001; i++) {
            if (count < countNum[i]) {
                count = countNum[i];
            }
        }
        for (int i = 0; i < 8001; i++) {
            if (countNum[i] == count) {
                checkList.add(i - 4000);
            }
        }
        List<Integer> sortedCheckList = checkList.stream().sorted().collect(Collectors.toList());
        if (sortedCheckList.size() == 1) {
            System.out.println(sortedCheckList.get(0));
        } else {
            System.out.println(sortedCheckList.get(1));
        }
    }

    static void printAverage() {
        double asDouble = sortedList.stream().mapToInt(n -> n).average().getAsDouble();
        long result = Math.round(asDouble);
        System.out.println(result);
    }
}
