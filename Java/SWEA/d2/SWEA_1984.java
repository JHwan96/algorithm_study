package d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_1984 {
	// 문제 이름: 중간 평균값 구하기
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i = 0; i < T; i++) {
			int result = 0;
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[10];
			for(int j = 0; j < 10; j++) {
				arr[j] = Integer.parseInt(st.nextToken()); 
			}
			Arrays.sort(arr);
			for(int j = 1; j < 9; j++) {
				result += arr[j];
			}
			System.out.println("#"+(i+1)+" "+Math.round((float)result/8));
		}
		
	}
}
