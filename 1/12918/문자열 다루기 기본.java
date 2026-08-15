class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        if(s.length() == 4 || s.length() == 6) {
            answer = true;
        }
        else return answer;
        
        for(int index = 0; index < s.length(); index++){
            if(48 > s.charAt(index) || s.charAt(index) > 57) {
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}