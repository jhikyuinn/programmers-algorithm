import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i : array){
            String stringi = String.valueOf(i);
            if(stringi.contains("7")){
                String[] subarray = stringi.split("");
                for(String j: subarray){
                    answer += (j.equals("7"))? 1 : 0;
                }
            }
        }
        return answer;
    }
}