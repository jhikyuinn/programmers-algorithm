import java.util.*;

class Solution {
    public String solution(String s) {
        
        int[] sarr = new int[26];
        String answer = "";
        
        for(int i = 0; i < s.length(); i++){
            sarr[s.charAt(i) - 97]++;
        }
        
        for(int index = 0; index < sarr.length; index++){
            if(sarr[index]==1) answer+= (char)(index+97);
        }
        
        return answer;
    }
}