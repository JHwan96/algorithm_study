package silver;

import java.io.*;
import java.nio.Buffer;
import java.util.*;

public class BOJ_2290 {
    //문제 이름: LCD Test
    //난이도: silver 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        long n = Long.parseLong(st.nextToken());

        String s1 = String.valueOf(n);
        char[] chars = s1.toCharArray();

        int length = chars.length * (s + 2) + chars.length-1;
        int height = s*2+3;
        String[][] result = new String[s * 2 + 3][length];
        for(int i = 0; i < height; i++){
            for(int j = 0; j < length; j++){
                result[i][j] = " ";
            }
        }

        System.out.println(length);

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                for(int j = 0; j < s; j++){
                    result[0][(s+3)*i+1+j]="-";
                    result[height-1][(s+3)*i+1+j]="-";

                    result[j+1][(s+3)*i]="|";
                    result[j+1][(s+3)*(i+1)-2]="|";

                    result[s+2+j][(s+3)*i]="|";
                    result[s+2+j][(s+3)*(i+1)-2]="|";
                }
            } else if (chars[i] == '1'){
                for(int j = 0; j < s; j++){
                    result[j+1][(s+3)*(i+1)-2]="|";
                    result[s+2+j][(s+3)*(i+1)-2]="|";
                }
            }else if (chars[i] == '2'){
                for(int j = 0; j < s; j++){
                    result[0][(s+3)*i+1+j]="-";
                    result[s+1][(s+3)*i+1+j]="-";
                    result[height-1][(s+3)*i+1+j]="-";

                    result[j+1][(s+3)*(i+1)-2]="|";

                    result[s+2+j][(s+3)*i]="|";

                }
            }else if (chars[i] == '3'){
                for(int j = 0; j < s; j++){
                    result[0][(s+3)*i+1+j]="-";
                    result[s+1][(s+3)*i+1+j]="-";
                    result[height-1][(s+3)*i+1+j]="-";

                    result[j+1][(s+3)*(i+1)-2]="|";

                    result[s+2+j][(s+3)*(i+1)-2]="|";
                }
            }else if (chars[i] == '4'){
                for(int j = 0; j < s; j++){
                    result[s+1][(s+3)*i+1+j]="-";

                    result[j+1][(s+3)*i]="|";
                    result[j+1][(s+3)*(i+1)-2]="|";

                    result[s+2+j][(s+3)*(i+1)-2]="|";
                }
            }else if (chars[i] == '5'){
                for(int j = 0; j < s; j++){
                    result[0][(s+3)*i+1+j]="-";
                    result[s+1][(s+3)*i+1+j]="-";
                    result[height-1][(s+3)*i+1+j]="-";

                    result[j+1][(s+3)*i]="|";

                    result[s+2+j][(s+3)*(i+1)-2]="|";
                }
            }else if (chars[i] == '6'){
                for(int j = 0; j < s; j++){
                    result[0][(s+3)*i+1+j]="-";
                    result[s+1][(s+3)*i+1+j]="-";
                    result[height-1][(s+3)*i+1+j]="-";

                    result[j+1][(s+3)*i]="|";

                    result[s+2+j][(s+3)*i]="|";
                    result[s+2+j][(s+3)*(i+1)-2]="|";
                }
            }else if (chars[i] == '7'){
                for(int j = 0; j < s; j++){
                    result[0][(s+3)*i+1+j]="-";


                    result[j+1][(s+3)*(i+1)-2]="|";
                    result[s+2+j][(s+3)*(i+1)-2]="|";
                }
            }else if (chars[i] == '8'){
                for(int j = 0; j < s; j++){
                    result[0][(s+3)*i+1+j]="-";
                    result[s+1][(s+3)*i+1+j]="-";
                    result[height-1][(s+3)*i+1+j]="-";

                    result[j+1][(s+3)*i]="|";
                    result[j+1][(s+3)*(i+1)-2]="|";

                    result[s+2+j][(s+3)*i]="|";
                    result[s+2+j][(s+3)*(i+1)-2]="|";
                }
            }else if (chars[i] == '9'){
                for(int j = 0; j < s; j++){
                    result[0][(s+3)*i+1+j]="-";
                    result[s+1][(s+3)*i+1+j]="-";
                    result[height-1][(s+3)*i+1+j]="-";

                    result[j+1][(s+3)*i]="|";
                    result[j+1][(s+3)*(i+1)-2]="|";

                    result[s+2+j][(s+3)*(i+1)-2]="|";
                }
            }

        }

        for(int i = 0; i < s*2+3; i++){
            for(int j = 0; j < length; j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
