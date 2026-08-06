class Solution {
    public String solution(int age) {
        String agestr = String.valueOf(age);
        
        String answer = "";
        for(int i=0; i < agestr.length(); i++){
            answer += (char)(agestr.charAt(i) + 49);
        }
   
        return answer;
    }
}