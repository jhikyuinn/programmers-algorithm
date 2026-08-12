class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ') answer += " ";
            else if((90 < (s.charAt(i) + n) && 64 < s.charAt(i) && s.charAt(i) < 91) || (s.charAt(i) + n) > 122)  {
                answer += (char)(s.charAt(i) + n - 26);
            }else{
                answer += (char)(s.charAt(i) + n);
            }
        }
        return answer;
    }
}