import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List <Integer> list = new ArrayList<>();
        for(int i : numbers){
            list.add(i);
        }
        if(direction.equals("right")){
            list.addFirst(list.getLast());
            list.removeLast();
        }else{
            list.addLast(list.getFirst());
            list.removeFirst();
        }
        
        
        int[] answer = new int[list.size()];
        for(int index = 0; index < list.size(); index++){
            answer[index]=list.get(index);
        }
        
        return answer;
    }
}