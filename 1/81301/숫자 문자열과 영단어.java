class Solution {
    public int solution(String s) {
        String[] stringnumber = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine","zero"};
        String[] number = {"1","2","3","4","5","6","7","8","9","0"};
        
        for(int i = 0; i < stringnumber.length; i++){
            s = s.replace(stringnumber[i],number[i]);
        }
        
        int answer = Integer.parseInt(s);
        return answer;
    }
}