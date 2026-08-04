import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        
        List <String> list = new ArrayList<>();
        
        String kdot = ".".repeat(k);
        String kx = "x".repeat(k);
        
        for(int i = 0 ; i < picture.length ; i++){
            int count = 0;
            while(true){
                list.add(picture[i].replace(".",kdot).replace("x",kx));
                count++;
                if(count == k ) break;
            }
        }
        
        String[] answer = new String[list.size()];
        for(int j = 0 ; j < list.size(); j++){
            answer[j] = list.get(j);
        }

        return answer;
    }
}