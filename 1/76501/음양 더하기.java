class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for(int index = 0; index < absolutes.length; index++){
            answer += (signs[index] == true)? absolutes[index] : (-1)*absolutes[index];
        }
        return answer;
    }
}