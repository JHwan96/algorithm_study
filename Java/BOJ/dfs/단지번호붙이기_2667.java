package boj.dfs;

import java.util.*;
import java.io.*;


public class 단지번호붙이기_2667 {

    static int[][] map;
    static boolean[][] visited;
    static List<Integer> result = new ArrayList<>();
    static int n;
    static int[] dx = new int[]{0,1, 0,-1};
    static int[] dy = new int[]{1,0,-1,0};
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        for(int i = 0; i < n; i++) {
            String temp = br.readLine();
            for(int j = 0; j < n; j++) {
                map[i][j] = Character.getNumericValue(temp.charAt(j));
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(map[i][j] == 1 && !visited[i][j]) {
                    count = 1;
                    dfs(i,j);
                    result.add(count);
                }
            }
        }

        Collections.sort(result);
        System.out.println(result.size());
        for(int a : result){
            System.out.println(a);
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i = 0; i < 4; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
                if(map[nx][ny] == 1 && !visited[nx][ny]){
                    count+=1;
                    dfs(nx,ny);
                }
            }
        }
    }
}
