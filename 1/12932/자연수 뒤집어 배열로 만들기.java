class Solution {
    public int[] solution(long n) {
        int length = String.valueOf(n).length(); 
        int[] answer = new int[length];
        
        int count = 0;
        while(count < length){
            answer[count++] = (int)(n % 10);
            n /= 10;
        }
        return answer;
    }
}