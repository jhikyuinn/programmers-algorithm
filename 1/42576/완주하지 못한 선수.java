import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        String answer = participant[participant.length - 1];
        for(int index = 0; index < participant.length -1; index++){
            if(!participant[index].equals(completion[index])) {
                answer = participant[index];
                break;
            }
        }
        return answer;
    }
}