import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        List <Integer> list = new ArrayList<>();
        for(int i=0; i < intStrs.length; i++){
            int value = Integer.parseInt(intStrs[i].substring(s,s+l));
            System.out.println(value);
            if(value > k){
                list.add(value);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int index = 0; index < list.size(); index++){
            answer[index]= list.get(index);
        }
        return answer;
    }
}