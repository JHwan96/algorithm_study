package d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_1979 {
	// 문제이름: 어디에 단어가 들어갈 수 있을까
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[][] arr = new int[N][N];
			int[][] width = new int[N][N];
			int[][] length = new int[N][N];

			int[] countArr = new int[N + 1];

			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for (int z = 0; z < N; z++) {
					arr[j][z] = Integer.parseInt(st.nextToken());
				}
			}

			for (int j = 0; j < N ; j++) {
				for (int k = 0; k < N - 1; k++) {
					int count = 0;
					if (width[j][k] == 1 || arr[j][k] == 0) {
						continue;
					}
					if (arr[j][k] == 1) {
						for (int z = k; z < N; z++) {
							if (arr[j][z] == 1) {
								count++;
								width[j][z] = 1;
								if(z == N-1) {
									countArr[count]+=1;
								}
							} else {
								if (count <= 1) {
									break;
								} else {
									countArr[count] += 1;
									break;
								}
							}
						}

					}
				}
			}

			for (int j = 0; j < N - 1; j++) {
				for (int k = 0; k < N ; k++) {
					int count = 0;
					if (length[j][k] == 1 || arr[j][k] == 0) {
						continue;
					}
					if (arr[j][k] == 1) {
						for (int z = j; z < N; z++) {
							if (arr[z][k] == 1) {
								count++;
								length[z][k] = 1;
								if(z == N-1) {
									countArr[count]+=1;
								}
							} else {
								if (count <= 1) {
									break;
								} else {
									countArr[count] += 1;
									break;
								}
							}
						}

					}
				}
			}

			System.out.println("#"+(i+1)+" "+countArr[K]);
		}

	}

}
