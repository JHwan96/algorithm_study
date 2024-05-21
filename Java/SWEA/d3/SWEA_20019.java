package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_20019 {
	// 문제 이름: 회문의 회문
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i =0; i < T; i++) {
			String temp = br.readLine();
			
			char[] arr = temp.toCharArray();
			int length = arr.length;
			int half = (length-1)/2;
			int flag = 1;
			
			for(int j = 0; j < half; j++) {
				if(arr[j] == arr[length-1-j]) {
					continue;
				} else {
					flag = 0;
					break;
				}
			}
			if(flag == 0) {
				System.out.println("#"+(i+1)+" "+"NO");
				continue;
			} else {
				int halfAgain = half/2;
				
				for(int j = 0; j < halfAgain; j++) {
					if(arr[j] == arr[half-1-j]) {
						continue;
					} else {
						flag = 0;
						break;
					}
				}
				
				if(flag == 0) {
					System.out.println("#"+(i+1)+" "+"NO");
					continue;
				}
				
				for(int j = 0; j < halfAgain; j++) {
					if(arr[half+j+1] == arr[length-1-j]) {
						continue;
					} else {
						flag = 0;
						break;
					}
				}
				
				if(flag == 0) {
					System.out.println("#"+(i+1)+" "+"NO");
				}
			}
			
			System.out.println("#"+(i+1)+" "+"YES");
			
			
		}
	}
}
