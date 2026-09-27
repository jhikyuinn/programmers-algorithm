class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] devide = new int[number];
        
        for(int i = 1; i <= number; i++){
            for(int j = 1 ; j <= i; j++){
                if(i%j ==0){
                    devide[i-1]++;
                }
            }
            if(devide[i-1] > limit){
                devide[i-1]=power;
            }
            answer += devide[i-1];
        }
        return answer;
    }
}