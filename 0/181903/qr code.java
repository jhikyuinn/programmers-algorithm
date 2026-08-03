class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] codeArr = code.split("");
        
        for(int index = 0; index < code.length(); index++){
            if(index % q == r) answer+=codeArr[index];
        }
        
        return answer;
    }
}