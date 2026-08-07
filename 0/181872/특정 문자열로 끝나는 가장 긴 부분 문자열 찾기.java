class Solution {
    public String solution(String myString, String pat) {
        
        int patlength = pat.length()-1;
        int index = 0;
        
        for(int i = myString.length()-1;i >= 0 ;i--){
            if(myString.charAt(i) == pat.charAt(patlength)) {
                index = i;
                patlength--;
            }
            if(patlength < 0) break;
        }
        
        String answer = myString.substring(0,index+pat.length());
        return answer;
    }
}