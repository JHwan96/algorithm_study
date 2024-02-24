package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1966 {
    //문제 이름: 프린터 큐
    //난이도: silver 3
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());


        for (int i = 0; i < X; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int count = 1;

            Queue<Integer> queue = new LinkedList<>();
            Queue<Integer> queueIdx = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                queue.offer(Integer.parseInt(st.nextToken()));
                queueIdx.offer(j);
            }

            while(true){
                int max = queue.stream().mapToInt(n -> n).max().getAsInt();
                int x = queue.poll();
                int xIdx = queueIdx.poll();
                if(x == max){
                    if(xIdx == M) {
                        System.out.println(count);
                        break;
                    } else {
                        count++;
                    }
                } else {
                    queue.offer(x);
                    queueIdx.offer(xIdx);
                }
            }

        }
    }
}
