class Solution {
    public int solution(int num) {
        int answer = 0;
        
        long longnum = (long)num;
        
        while(longnum != 1){
            if(longnum % 2 == 0){
                longnum /= 2;
            }else{
                longnum = longnum * 3 + 1;
            }
            answer++;
        }
        
        return (answer > 500) ? -1 : answer;
    }
}