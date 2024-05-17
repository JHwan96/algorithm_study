package d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1859 {
	// 문제 이름: 백만 장자 프로젝트
	public static void main(String[] args) throws Exception{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st;
		 int T = Integer.parseInt(br.readLine());
		 
		 for(int i = 0 ; i < T; i++) {
			 int N = Integer.parseInt(br.readLine());
			 st = new StringTokenizer(br.readLine());
			 int[] arr = new int[N];
			
			 for(int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(st.nextToken()); 
			 }
			 
			 long result = checkPrice(arr);
			 System.out.println("#"+(i+1)+" "+result);
			 
		 }
		 
	}
	
	public static long checkPrice(int[] arr) {
		long result = 0;
		int N = arr.length;
		int temp = arr[N-1];
		for(int i = N-2; i >= 0; i--) {
			if(temp > arr[i]) {
				result += (temp-arr[i]);
			} else {
				temp = arr[i];
			}
		}
		
		return result;
	}
}
