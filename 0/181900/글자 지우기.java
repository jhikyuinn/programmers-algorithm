import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        Arrays.sort(indices);
        for (int index = 0; index < my_string.length() ; index++){
            final int idx = index;
            boolean hasValue = Arrays.stream(indices).anyMatch(i -> i == idx);
            if(hasValue == false) answer+=String.valueOf(my_string.charAt(index));
        }
        
        
        return answer;
    }
}