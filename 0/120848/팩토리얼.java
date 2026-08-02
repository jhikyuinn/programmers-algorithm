class Solution {
    public int solution(int n) {
        int answer = 0;
        int value = 1;
        
        while(value <= n){
            answer += 1;
            value *= answer;
            if(answer == 10) break;
        }
        answer= (answer == 10)? answer : answer-1;
        return answer;
    }
}