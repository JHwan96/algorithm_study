package d1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_2058 {
	// 문제이름: 자릿수 더하기
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int result = 0; 
	
		while(true) {
			result += (N%10); 
			if(N / 10 == 0) {
				break;
			} else {
				N/=10;
			}
			
		}
		System.out.println(result);
	}
}
