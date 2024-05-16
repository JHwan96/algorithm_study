package d1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SWEA_2050 {
	// 문제이름: 알파벳을 숫자로 변환
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int charToInt = 64;
		char[] charArray = str.toCharArray();
		for(int i = 0; i < charArray.length; i++) {
			System.out.print((charArray[i]-charToInt));
			
			if(i != charArray.length-1) {
				System.out.print(" ");
			}
		}
	}
}
