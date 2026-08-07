import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        
        List <String> list = new ArrayList <>();
        String value = "";
        my_string = my_string.trim();
        
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) == ' ') {
                if(value != ""){
                    list.add(value);
                    value = "";
                }
                continue;
            }
            else{
                value+=my_string.charAt(i);
                if(i == my_string.length() -1) list.add(value);
            }
        }
        String[] answer = new String[list.size()];
        list.toArray(answer);
        
        return answer;
    }
}