import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List <Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length ; i++){
            if(flag[i] == true) {
                int k = arr[i]*2;
                while( k > 0){
                    list.add(arr[i]);
                    k--;
                }
            }else{
                int t = arr[i];
                while( t > 0){
                    list.removeLast();
                    t--;
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int index = 0; index < list.size(); index++){
            answer[index] = list.get(index);
        }
            
        return answer;
    }
}