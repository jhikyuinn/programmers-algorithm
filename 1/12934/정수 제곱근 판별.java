import java.lang.Math;

class Solution {
    public long solution(long n) {
        long answer = (Math.sqrt(n) % 1 == 0) ? (long)((Math.sqrt(n)+1) * (Math.sqrt(n)+1)) : -1;
        
        return answer;
    }
}