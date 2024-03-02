package silver;
import java.io.*;
import java.util.*;

public class BOJ_2075 {
    // 문제 이름: N번째 큰 수
    // 난이도: silver 2
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Comparator.reverseOrder());
        StringTokenizer st;
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++){
                queue.offer(Integer.parseInt(st.nextToken()));
            }
        }
        for(int i = 0; i < n-1; i ++) {
            queue.poll();
        }
        System.out.println(queue.poll());
    }
}
