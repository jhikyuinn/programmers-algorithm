class Solution {
    public int solution(int num) {
        
        int count = 0;
        long numlong = num;
        
        while(numlong != 1 && count < 500){
            if(numlong % 2 == 0) numlong /= 2;
            else numlong = numlong * 3 + 1;
            count++;
        }     
        int answer = (count == 500)? -1 : count;
        return answer;
    }
}