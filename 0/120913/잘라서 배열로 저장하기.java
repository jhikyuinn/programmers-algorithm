class Solution {
    public String[] solution(String my_str, int n) {
        int answersize = (my_str.length() % n == 0) ? my_str.length() / n : my_str.length() / n + 1;
        String[] answer = new String[answersize];
        
        
        int index = 0;
        while(true){
            if(index == answersize-1) {
                answer[index] = my_str.substring(index * n, my_str.length());  
                break;
            }
            else{
                answer[index] = my_str.substring(index * n, (index*n+n));
                index++;
               
            }
        }
        return answer;
    }
}