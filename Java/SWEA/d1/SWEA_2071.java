package d1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2071 {
	// 문제이름: 평균값 구하기
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int result = 0;
			for(int j = 0; j < 10; j++) {
				result += Integer.parseInt(st.nextToken());
			}
			
			System.out.println("#"+(i+1)+" "+Math.round(((float)result/10)));
		}
		
	}
}
