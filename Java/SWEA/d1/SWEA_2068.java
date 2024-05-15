package d1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2068 {
	// 문제이름: 최대 수 구하기
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			int result = -1;
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 10; j++) {
				int tempInt = Integer.parseInt(st.nextToken());
				if(result < tempInt) {
					result = tempInt;
				}
			}
			System.out.println("#"+(i+1)+" "+result);
		}
	}
}
