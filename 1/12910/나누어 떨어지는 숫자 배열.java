import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        List <Integer> list = new ArrayList<>();
        
        Arrays.sort(arr);
        for(int value:arr){
            if(value % divisor == 0) list.add(value);
        }

        int[] answer = list.stream().mapToInt(i->i).toArray();
        
        return answer.length == 0 ? new int[]{-1} : answer;
    }
}
