package d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_1989 {
	// ���� �̸�: �ʽ����� ȸ�� �˻�
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			int result = 0;
			String temp = br.readLine();
			int length = temp.length();
			int half = length/2;
			
			for(int j = 0; j < half; j++) {
				if(temp.charAt(j) == temp.charAt(length-1-j)) {
					if(j == half-1) {
						result = 1;
					}
					continue;
				} else {
					break;
				}
			}
			System.out.println("#"+(i+1)+" "+result);
			
		}
	}
}
