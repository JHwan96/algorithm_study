package d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class SWEA_17937 {
	// 문제 이름: 큰 수의 최대공약수
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			BigInteger A = new BigInteger(st.nextToken());
			BigInteger B = new BigInteger(st.nextToken());
			BigInteger check = new BigInteger("0");

			if(!A.equals(B)) {
				System.out.println("#"+(i+1)+" "+1);
			} else {
				System.out.println("#"+(i+1)+" "+A.toString());
			}

		}
	}
}
