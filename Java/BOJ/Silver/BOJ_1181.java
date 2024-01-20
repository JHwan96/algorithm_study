package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class BOJ_1181 {
    // 문제 이름: 단어 정렬
    // 난이도: Silver 5
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String>[] arrayLists = new ArrayList[51];
        List<String> strList = new ArrayList<>();

        for(int i=0; i<51; i++){
            arrayLists[i] = new ArrayList<>();
        }

        for(int i = 0; i < N; i++){
            String temp = br.readLine();
            ArrayList<String> arrayList = arrayLists[temp.length()];
            if(arrayList.contains(temp)){
                continue;
            } else{
                arrayList.add(temp);
            }
        }
        for(ArrayList<String> str : arrayLists){
            strList.addAll(str.stream().sorted().collect(Collectors.toList()));
        }
        for(String str : strList){
            System.out.println(str);
        }


/*        Arrays.sort(strList.toArray(String[]::new), new Comparator<String>() {
            public int compare(String s1, String s2) {
                // 단어 길이가 같을 경우
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                // 그 외의 경우
                else {
                    return s1.length() - s2.length();
                }
            }
        });*/
    }
}
