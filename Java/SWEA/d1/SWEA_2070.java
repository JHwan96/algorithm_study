package d1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA_2070 {
	//¹®Á¦ ÀÌ¸§: Å« ³ð, ÀÛÀº ³ð, °°Àº ³ð
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a > b) {
				System.out.println("#"+(i+1)+" "+ ">");
			} else if(a==b) {
				System.out.println("#"+(i+1)+" "+ "=");
			} else {
				System.out.println("#"+(i+1)+" "+ "<");
			}
		}
	}
}
