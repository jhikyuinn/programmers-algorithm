import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        List <String> answerlist = new ArrayList<>();
        
        String value = "";
        for(int i=0; i < myStr.length(); i++){
            if(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c'){
                if(value.length() != 0 ) {
                    answerlist.add(value);
                    value = "";
                }
            }else{
                value +=myStr.charAt(i);
                if(i == myStr.length()-1) answerlist.add(value);
            }
        }
        
        String[] answer = new String[answerlist.size()];
        for(int index = 0; index < answerlist.size(); index++){
            answer[index]=answerlist.get(index);
        }
        if(answer.length == 0) return new String[]{"EMPTY"};
        
        return answer;
    }
}