import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List <Integer> list = new ArrayList<>();
        
        for(int i:arr){
            if(i%divisor == 0) list.add(i);
        }
        
        if(list.size()==0) return new int[]{-1};
        
        int[] answer = new int[list.size()];
        for(int j = 0; j < list.size(); j++){
            answer[j]= list.get(j);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}