class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int maxvalue = a > b ? a: b;
        int gcdvalue = 1;
        for(int i = 1 ; i < maxvalue; i++){
            if(a % i ==0 && b % i ==0){
                gcdvalue = i;
            }
        }
        
        a /= gcdvalue;
        b /= gcdvalue;
        
        int count = 2;
        while(b>1){
            if(b % count == 0){
                if(count == 2 || count ==5) b /= count;
                else return 2;
            }else{
                count++;
            }
        }
        
        return answer;
    }
}