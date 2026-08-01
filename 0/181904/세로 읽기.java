class Solution {
    public String solution(String my_string, int m, int c) {
        
        String[] my_stringArr = my_string.split("");
        String answer = "";
        
        for(int i = c-1 ; i < my_stringArr.length ; i+=m){
            answer+=my_stringArr[i];
        }
        
        return answer;
    }
}