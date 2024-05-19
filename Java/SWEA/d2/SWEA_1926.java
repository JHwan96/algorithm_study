package d2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWEA_1926 {
   public static void main(String[] args) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int T = Integer.parseInt(br.readLine());
      
      for(int i = 1; i <= T; i++) {
         String result = "";
         String a = String.valueOf(i);
         for(int j = 0; j < a.length(); j++) {
            char tempChar = a.charAt(j);
            if(tempChar == '3' || tempChar =='6' || tempChar=='9') {
               if(!result.isEmpty()) {
                  for(int z = 0; z < result.length(); z++) {
                     if(result.charAt(z) == '-') {
                        continue;
                     } else {
                        result = "";
                     }
                  }
                  result += '-';
               } else {
                  result += '-';
               }
            } else {
               int flag = 1;
               if(!result.isEmpty()) {
                  for(int z = 0; z < result.length(); z++) {
                     if(result.charAt(z) == '-') {
                        flag = -1;
                        break;
                     } 
                  }
                  if (flag != -1) {
                     result+=tempChar;
                  }
               } else {
                  result += tempChar;
               }
            }
         }
      
         
         System.out.print(result);
         if(i != T) {
            System.out.print(" ");
         }
      }
      
   }
}