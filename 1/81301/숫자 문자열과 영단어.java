class Solution {
    public int solution(String s) {
        
        String[] numbers_words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] numbers_digits = {"0","1","2","3","4","5","6","7","8","9"};
        
        
        for(int i = 0; i < 10; i++){
            s = s.replace(numbers_words[i], numbers_digits[i]);
        }
        
        int answer = Integer.parseInt(s);
        return answer;
    }
}