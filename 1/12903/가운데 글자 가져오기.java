class Solution {
    public String solution(String s) {
        int strlength = s.length();
        String answer = (strlength % 2 == 1) ? s.substring(strlength/2,strlength/2 +1): s.substring(strlength/2 -1 ,strlength/2 +1);
        return answer;
    }
}