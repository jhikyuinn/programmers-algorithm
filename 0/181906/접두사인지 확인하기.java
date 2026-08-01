class Solution {
    public int solution(String my_string, String is_prefix) {
        int fixlength = (is_prefix.length() > my_string.length()) ? my_string.length() : is_prefix.length() ;
        
        String my_stringtest = my_string.substring(0, fixlength);
        
        int answer = my_stringtest.equals(is_prefix)? 1:0;
        
        return answer;
    }
}