package d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_1986 {
	// 문제이름: 지그재그 숫자
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int result = 0;
			int N = Integer.parseInt(br.readLine());
			for (int j = 1; j <= N; j++) {
				if (j % 2 == 0) {
					result -= j;
				} else {
					result += j;
				}
			}
			System.out.println("#"+(i+1)+" "+result);
		}

	}
}
