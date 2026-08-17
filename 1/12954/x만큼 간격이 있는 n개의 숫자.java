class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        int count = 0;
        while(count != n){
            answer[count++] = (count) * (long)x;
        }
        return answer;
    }
}