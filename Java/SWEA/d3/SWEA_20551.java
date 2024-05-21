package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_20551 {
	// 문제 이름: 증가하는 사탕 수열
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[3];
		StringTokenizer st;
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 3; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			int count = 0;
			
			if(arr[1] == 1 || arr[2] == 1 || arr[2]==2) {
				System.out.println("#"+(i+1)+" "+(-1));
				continue;
			} else {
				if(arr[2] <= arr[1]) {
					count += arr[1]-arr[2]+1;
					arr[1] = arr[2]-1;
				}
				if(arr[1] <= arr[0]) {
					count += arr[0]-arr[1]+1;
				}
			}
			System.out.println("#"+(i+1)+" "+count);
		}
	}
}
