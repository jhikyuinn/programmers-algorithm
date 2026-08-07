class Solution {
    public int solution(int[][] dots) {
            
        int xminVal = dots[0][0];   
        int xmaxVal = dots[0][0];  
        int yminVal = dots[0][1];    
        int ymaxVal = dots[0][1];  
        for (int i = 1; i < dots.length; i++) {            
            xminVal = Math.min(xminVal, dots[i][0]);   
            xmaxVal = Math.max(xmaxVal, dots[i][0]);  
            yminVal = Math.min(yminVal, dots[i][1]);  
            ymaxVal = Math.max(ymaxVal, dots[i][1]);        
        } 
        
        int answer = (xmaxVal-xminVal) * (ymaxVal-yminVal);
        return answer;
    }
}