package pgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PSG_연속된_부분_수열의_합 {
    //난이도: 2
    public static void main(String[] args) {
        int[] sequence = new int[]{1,2,3,4,5};
        int k = 7;
        int[] solution = solution(sequence, k);
        System.out.println(solution[0] + " " + solution[1]);
    }

    public static int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        List<int[]> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        int sum = sequence[0];
        int length = sequence.length;

        while(start < length && end < length){
            if(sum == k) {
                list.add(new int[]{start, end});
            }
            if(sum <= k){
                end++;
                if(end < length) {
                    sum += sequence[end];
                }
            } else{
                if(start < length) {
                    sum -= sequence[start];
                }
                start++;
            }
        }

        Collections.sort(list, (o1, o2) -> {
            int len1 = o1[1]-o1[0];
            int len2 = o2[1]-o2[0];
            return len1-len2;
        });

        return list.get(0);
    }
}
