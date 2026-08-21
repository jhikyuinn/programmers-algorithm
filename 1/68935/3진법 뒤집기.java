import java.util.*;

class Solution {
    public int solution(int n) {
        List <Integer> list = new ArrayList<>();
        
        while(n > 0){
            list.addFirst(n%3);
            n = n / 3;
        }
        
        int answer = list.get(0);
        
        for(int i = 1; i < list.size(); i++){
            answer += Math.pow(3 ,i) * list.get(i);
        }
        System.out.println(list);
        
        
        return answer;
    }
}