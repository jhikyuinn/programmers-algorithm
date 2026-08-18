import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int count = 0;        
        for(int[] comm :commands){
            int[] arraycomm = Arrays.copyOfRange(array,comm[0]-1,comm[1]);
            Arrays.sort(arraycomm);
            answer[count++] = arraycomm[comm[2]-1];
        }
        
        return answer;
    }
}