import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        
        if (arr.length == 1) return new int[]{-1};
        
        int min = arr[0];
        for(int value: arr){
            if( value < min ) min = value;
        }
       
        List <Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.remove(Integer.valueOf(min));
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}