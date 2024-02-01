package silver;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class BOJ_1260 {
    //문제 이름: DFS와 BFS
    //난이도: silver 2
    static int N, M, V;
    static StringTokenizer st;
    static Map<Integer, List<Integer>> graph;
    static int[] checkArr;
    static BufferedWriter bw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        checkArr = new int[N + 1];
        graph = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            List<Integer> temp = new ArrayList<>();
            graph.put(i, temp);
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            graph.get(first).add(second);
            graph.get(second).add(first);
        }
        for (int i = 1; i <= N; i++) {
            List<Integer> sortedIntegers = graph.get(i).stream().sorted().collect(Collectors.toList());
            graph.put(i, sortedIntegers);
        }

        dfs(V);
        bw.write("\n");
        checkArr = new int[N + 1];
        bfs(V);

        br.close();
        bw.close();
    }

    static void dfs(int start) throws IOException {
        checkArr[start] = 1;

        bw.write(start+" ");

        List<Integer> integers = graph.get(start);
        if (integers.isEmpty()) {
            return;
        } else {
            for (int i = 0; i < integers.size(); i++) {
                Integer integer = integers.get(i);
                if (checkArr[integer] == 1) {
                    continue;
                } else {
                    checkArr[integer] = 1;
                    dfs(integer);
                }
            }
        }
        bw.flush();
    }

    static void bfs(int start) throws IOException {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        checkArr[start] = 1;
        while (!q.isEmpty()) {
            Integer poll = q.poll();
            bw.write(poll + " ");

            List<Integer> integers = graph.get(poll);
            for (Integer integer : integers) {
                if (checkArr[integer] != 1) {
                    q.offer(integer);
                    checkArr[integer] = 1;
                }
            }
        }
        bw.flush();
    }
}
