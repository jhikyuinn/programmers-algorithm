class Solution {
    public int solution(int[] num_list) {
        int evensum = 0;
        int oddsum = 0;
        
        for(int i = 0; i< num_list.length; i++){
            if(i%2==1) oddsum+=num_list[i];
            else evensum+=num_list[i];
        }
        
        int answer = (evensum>=oddsum)?evensum:oddsum;
        return answer;
    }
}