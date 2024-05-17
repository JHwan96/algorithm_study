package d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_2005 {
	// 문제이름: 파스칼의 삼각형
	
	static int[][] pascal = new int[11][11];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		pascal[1][1] = 1;
		pascal[2][2] = 1;
		pascal[2][1] = 1;
		
		for(int i = 3; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				if(j == 1 || j == i) {
					pascal[i][j] = 1;
				} else {
					pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
				}
			}
		}
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			System.out.println("#"+(i+1));
			printPascal(N);
			
		}
	}
	
	public static void printPascal(int N) {
		for(int i = 1 ; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(pascal[i][j]);
				
				if(j != i) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}