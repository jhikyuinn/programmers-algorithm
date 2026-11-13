
class Solution {
    public String solution(String s) {
        
        String answer = "";
        int count = 0;
        for (int index = 0; index < s.length(); index++){
            if (Character.isLetterOrDigit(s.charAt(index))){
                if(count % 2 == 1) answer += String.valueOf(s.charAt(index)).toLowerCase();
                else answer += String.valueOf(s.charAt(index)).toUpperCase();
                count++;
            }else{
                answer += String.valueOf(s.charAt(index));
                count = 0;
            }
        }
        
        return answer;
    }
}
