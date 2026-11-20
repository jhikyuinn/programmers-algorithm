class Solution {
    public int[] solution(long n) {
        int answersize = String.valueOf(n).length(); 
        int[] answer = new int[answersize];
        
        for(int i = 0; i < answersize; i++){
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        return answer;
    }
}