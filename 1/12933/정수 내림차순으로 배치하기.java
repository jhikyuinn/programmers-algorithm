import java.util.*;

class Solution {
    public long solution(long n) {
        int length = String.valueOf(n).length();
        
        int[] valuearray = new int[length];
        int count = 0;

        while(n > 0){
            valuearray[count++] = (int)(n % 10);
            n /= 10;
        }
        
        Arrays.sort(valuearray);
        String value = "";
        for(int index = length-1 ; index >= 0; index--){
            value+=valuearray[index];
        }
        
        long answer = Long.parseLong(value);
        return answer;
    }
}