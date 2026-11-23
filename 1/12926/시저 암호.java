class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (char c : s.toCharArray()) {
            if(64 < c && c < 91 ){
                c += n;
                if(c >= 91) c -= 26;
            }else if(96 < c && c < 123){
                c += n;
                if(c >= 123) c -= 26;
            }
            answer += (char)c;
        }

        return answer;
    }
}