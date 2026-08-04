class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int remaincoupons = 0;
        
        while (chicken >= 10) {
            remaincoupons = chicken / 10;
            answer += remaincoupons;
            chicken = remaincoupons + chicken % 10; 
        }
        
        return answer;
    }
}