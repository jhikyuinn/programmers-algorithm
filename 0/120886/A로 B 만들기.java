import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        
        String[] beforearr = before.split("");
        String[] afterarr = after.split("");
        
        Arrays.sort(beforearr);
        Arrays.sort(afterarr);
        
        for(int i = 0; i < beforearr.length; i++){
            if(!beforearr[i].equals(afterarr[i])) return 0;
        }
        
        return answer;
    }
}