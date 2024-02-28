package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2477 {
    //문제 이름: 참외밭
    //난이도: silver 2
    static int smallLength, smallHeight;
    static int[] arr = new int[6];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int length = 0;
        int height = 0;
        int lengthIdx = 0;
        int heightIdx = 0;
        StringTokenizer st;
        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine());
            int pos = Integer.parseInt(st.nextToken());
            int size = Integer.parseInt(st.nextToken());
            arr[i] = size;
            if (pos == 1 || pos == 2) {
                if(length < size) {
                    length = size;
                    lengthIdx = i;
                }
            } else {
                if(height < size) {
                    height = size;
                    heightIdx = i;
                }
            }
            smallLength = checkLength(lengthIdx);
            smallHeight = checkLength(heightIdx);

        }
        int result = ((height * length) - (smallLength * smallHeight)) * K;
        System.out.println(result);
    }

    static int checkLength(int idx) {
        int length = 0;
        if (idx == 0) {
            length = Math.abs(arr[1] - arr[5]);
        } else if (idx == 5) {
            length = Math.abs(arr[4] - arr[0]);
        } else {
            length = Math.abs(arr[idx - 1] - arr[idx + 1]);
        }
        return length;
    }
}
