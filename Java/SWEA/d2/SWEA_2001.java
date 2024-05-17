package d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2001 {
	// 문제이름: 파리 퇴치

	static int[][] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		

		for (int z = 0; z < T; z++) {
			int result = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			arr = new int[N][N];
			
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			for (int i = 0; i <= N - M; i++) {
				for (int j = 0; j <= N - M; j++) {
					int tempKills = getFlyKills(i, j, M);
					if (result < tempKills) {
						result = tempKills;
					}
				}
			}
			System.out.println("#" + (z + 1) + " " + result);
		}
	}

	public static int getFlyKills(int i, int j, int M) {
		int result = 0;
		for (int z = 0; z < M; z++) {
			for (int x = 0; x < M; x++) {
				result += arr[i + z][j + x];
			}
		}

		return result;
	}
}
