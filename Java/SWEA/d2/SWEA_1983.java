package d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;


public class SWEA_1983 {
	// 문제이름: 조교의 성적 매기기
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String[] grade = {"A+","A0","A-","B+","B0","B-","C+","C0","C-","D0"};
		StringTokenizer st;
		float test = 0;
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			Integer[] arr = new Integer[N];
			for(int j = 0; j < N; j++) {
				int result = 0;
				st = new StringTokenizer(br.readLine());
				result+=Integer.parseInt(st.nextToken())*35;
				result+=Integer.parseInt(st.nextToken())*45;
				result+=Integer.parseInt(st.nextToken())*20;
				arr[j] = result;
			}
			int tempScore = arr[K-1];
			Arrays.sort(arr,Collections.reverseOrder());
			test = N/10;
			
			int count = 0;
			for(int check : arr) {
				if(check == tempScore) {
					break;
				} else {
					count++;
				}
			}
			System.out.println(count);
			
			int gradeNum = -1;
			for(int j = 1 ; j<= 10; j++) {
				if(count < test*j) {
					gradeNum = j-1;
					break;
				} 
			}
			
			System.out.println("#"+(i+1)+" "+grade[gradeNum]);
			
		}
		
	}

}
