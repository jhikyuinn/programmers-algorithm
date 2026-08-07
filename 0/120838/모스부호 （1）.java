class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        String[] letterstr = letter.split(" ");
        String answer = "";
        
        for(String i : letterstr){
            for(int j = 0; j < morse.length; j++){
                if(i.equals(morse[j])) {
                    answer+= String.valueOf((char)(j + 97));
                    break;
                }
            }
        }
        
        return answer;
    }
}