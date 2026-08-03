import java.util.*;

class Solution {
    public int solution(int[] array) {
        
        Arrays.sort(array);
        int maxvalue = array[0];
        int maxcount = 1;
        int count = 1;
        int answer = 0;
        boolean tie = false;
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count > maxcount) {
                maxcount = count;
                maxvalue = array[i];
                tie = false;
            } else if (count == maxcount && array[i] != maxvalue) {
                tie = true;
            }
        }
        
        
        return answer = tie ? -1: maxvalue;
    }
}