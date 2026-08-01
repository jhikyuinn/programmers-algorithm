import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List <Integer> list = new ArrayList<>();
        
        int arr1start = intervals[0][0];
        int arr1end = intervals[0][1];
        int arr2start = intervals[1][0];
        int arr2end = intervals[1][1];
        
        
        for(int i = arr1start; i < arr1end+1 ; i++) list.add(arr[i]);
        for(int j = arr2start; j < arr2end+1 ; j++) list.add(arr[j]);
        
        int[] answer = new int[list.size()];
        for(int index = 0; index < list.size() ; index++){
            answer[index] = list.get(index);
        }
        
        return answer;
    }
}