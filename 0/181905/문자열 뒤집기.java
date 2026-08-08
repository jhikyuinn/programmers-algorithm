class Solution {
    public String solution(String my_string, int s, int e) {
        
        String original = my_string.substring(s,e+1);
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        String answer = my_string.substring(0,s) + reversed + my_string.substring(e+1,my_string.length());
        return answer;
    }
}