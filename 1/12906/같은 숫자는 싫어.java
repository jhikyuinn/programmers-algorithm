import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List <Integer> list = new ArrayList<>();
        
        for(int i : arr){
            if(list.size() == 0) list.add(i);
            if(list.getLast() == i) {
                continue;
            }else{
                list.add(i);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int index = 0; index < list.size(); index++){
            answer[index] = list.get(index);
        }

        return answer;
    }
}