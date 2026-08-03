class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int min = Math.min(denom1,denom2);
        int max = Math.max(denom1,denom2);
        int value = 1;
                
        while(true){
            if(min == max){
                answer[1] = min;
                break;
            }else if(min * value % max == 0 ) {
                answer[1] = min*value; 
                break;
            }
            value++;
        }
        answer[0] = numer1*(answer[1]/denom1) +  numer2*(answer[1]/denom2);
                
        int finalmin = Math.min(answer[0],answer[1]);
        int finalmax = Math.max(answer[0],answer[1]);
        
        int gcd = 1;
        for (int i = finalmin; i > 1; i--) {
            if (finalmin % i == 0 && finalmax % i == 0) {
                gcd = i;
                break;
            }
        }

        answer[0] /= gcd;
        answer[1] /= gcd;
        
        return answer;
    }
}