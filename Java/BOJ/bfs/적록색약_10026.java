package boj.bfs;

import java.util.*;
import java.io.*;

public class 적록색약_10026 {
    // R: 0, G: 1, B:2
    static int n;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = new int[] {0,1,0,-1};
    static int[] dy = new int[] {1,0,-1,0};
    static int normal = 0;
    static int abnormal = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n+1][n+1];
        visited = new boolean[n+1][n+1];

        for(int i = 0; i < n; i++) {
            String temp = br.readLine();
            for(int j = 0; j < n; j++) {
                char tempChar = temp.charAt(j);
                if(tempChar == 'R'){
                    map[i][j] = 0;
                } else if(tempChar == 'G') {
                    map[i][j] = 1;
                } else {
                    map[i][j] = 2;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(!visited[i][j]){
                    bfs(i,j, map[i][j]);
                    normal++;
                }
            }
        }
        System.out.print(normal + " ");

        visited = new boolean[n+1][n+1];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!visited[i][j]) {
                    bfs_2(i,j,map[i][j]);
                    abnormal++;
                }
            }
        }
        System.out.println(abnormal);

    }

    public static void bfs(int x, int y, int check){
        Deque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{x,y});
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            int[] a = queue.poll();
            for(int i = 0; i < 4; i++) {
                int nx = a[0] + dx[i];
                int ny = a[1] + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    if(!visited[nx][ny] && map[nx][ny] == check){
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx,ny});
                    }
                }
            }
        }
    }

    public static void bfs_2(int x, int y, int check) {
        Deque<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{x,y});
        visited[x][y] = true;

        if(check==1){
            check=0;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                if(map[i][j]==1) {
                    map[i][j]=0;
                }
            }
        }

        while(!queue.isEmpty()) {
            int[] poll = queue.poll();
            for(int i = 0; i < 4; i++) {
                int nx = poll[0] + dx[i];
                int ny = poll[1] + dy[i];
                if(nx >= 0 && nx < n && ny >= 0 && ny < n){
                    if(map[nx][ny] == check && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx,ny});
                    }
                }
            }
        }
    }
}
