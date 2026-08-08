import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        int[] resultArr = Arrays.stream(arr).distinct().toArray();
        int count = 0;
        
        for(int i = 0; i < resultArr.length; i++){
            if(count == 0) answer[count++] = resultArr[i];
            else if (count == k) break;
            else if(answer[count-1] != resultArr[i]){
                answer[count++] = resultArr[i];
            }
        }
        return answer;
    }
}