package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class SWEA_20728 {
	// 문제 이름: 공평한 분배 2
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			Integer[] arr = new Integer[N];
			st = new StringTokenizer(br.readLine());

			for (int j = 0; j < N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr, Collections.reverseOrder());

			int min = Integer.MAX_VALUE;
			for(int j = 0; j < N-K+1; j++) {
				int temp = arr[j]-arr[j+K-1];
				if (min > temp) {
					min = temp;
				}
			}

			System.out.println("#" + (i + 1) + " " + min);

		}
	}
}
