class Solution {
    public boolean solution(int x) {
    
        int testx = x;
        int xsum = 0;
        while(testx > 0){
            xsum += testx % 10;
            testx = testx / 10;
        }
        
        boolean answer = (x % xsum == 0) ? true: false;
        return answer;
    }
}