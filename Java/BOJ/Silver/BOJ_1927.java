package silver;
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class BOJ_1927 {
    // 문제 이름: 최소 힙
    // 난이도: silver 2
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            int temp = Integer.parseInt(br.readLine());
            if(temp == 0){
                if(queue.isEmpty()) {
                    System.out.println("0");
                } else{
                    Integer poll = queue.poll();
                    System.out.println(poll);
                }
            } else {
                queue.add(temp);
            }

        }

    }
}
