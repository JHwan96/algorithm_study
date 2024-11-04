package pgs;

public class PSG_babbling_2 {
    //난이도: 1단계
    //이름: 옹알이(2)
    public static void main(String[] args) {
        String[] babbling = {};
        int answer = babbling_2(babbling);
    }

    private static int babbling_2(String[] babbling) {
        int answer = 0;
        String[] no = {"ayaaya", "yeye", "woowoo", "mama"};
        String[] yes = {"aya", "ye", "woo", "ma"};

        for(String a : no){
            for(int i = 0; i < babbling.length; i++){
                babbling[i] = babbling[i].replace(a, "0");
            }
        }
        for(String b : yes){
            for(int i = 0; i < babbling.length; i++){
                babbling[i] = babbling[i].replace(b,"1");
            }
        }

        for(int i = 0; i < babbling.length; i++){
            babbling[i] = babbling[i].replace("1", "");
            if(babbling[i].equals("")){
                answer++;
            }
        }
        return answer;
    }
}
