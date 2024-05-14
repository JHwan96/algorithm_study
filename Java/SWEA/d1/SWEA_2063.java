package d1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class SWEA_2063 {
	//문제이름: 중간값 찾기
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> test = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			test.add(Integer.parseInt(st.nextToken()));
		}
		Collections.sort(test);
		System.out.println(test.get(N/2));
	}
}
