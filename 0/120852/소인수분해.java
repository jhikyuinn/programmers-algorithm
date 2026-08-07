import java.util.*;

class Solution {
    public int[] solution(int n) {
        List <Integer> list = new ArrayList<>();
        int count = 2;
        
        while(n>1){
            if(n%count==0){
                n /= count;
                if(!list.contains(count)) list.add(count);
            }else{
                count++;
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++ ){
            answer[i] = list.get(i);
        }
        return answer;
    }
}