import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String[] reversepat = pat.split("");
        
        for(int i = 0; i< reversepat.length ; i++){
            if(reversepat[i].equals("A")) reversepat[i] = "B";
            else reversepat[i] = "A";
        }
        String reversepatString = String.join("",reversepat);
        
        if( myString.contains(reversepatString)) answer = 1;
        
        return answer;
    }
}