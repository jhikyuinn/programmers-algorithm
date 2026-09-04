import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        
        Integer[] boxed = Arrays.stream(numlist).boxed().toArray(Integer[]::new);
        
        Arrays.sort(boxed, (a, b) -> {
            int da = Math.abs(a - n);
            int db = Math.abs(b - n);
            if (da != db) return da - db;  
            return b - a;                   
        });
        
        int[] answer = new int[boxed.length];
        for (int i = 0; i < boxed.length; i++) {
            answer[i] = boxed[i];
        }
        return answer;
    }
}