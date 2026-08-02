class Solution {
    public int solution(int n) {
        int answer = 1;
        
        while((6*answer) % n != 0){
            answer++;
            if((6*answer) % n == 0) break;
        }
        
        return answer;
    }
}