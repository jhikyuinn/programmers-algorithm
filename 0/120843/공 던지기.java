class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 1;
        for(int i = 1 ; i < k; i++){
            answer = (answer+2 > numbers.length ) ? (answer+2) % numbers.length : answer+2 ;
        }
        return answer;
    }
}