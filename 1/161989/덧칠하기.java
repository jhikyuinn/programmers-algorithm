class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int range = 0;
        for(int i = 0; i < section.length; i++){
            if(range <= section[i]) {
                range = section[i] + m;
            }else {
                continue;
            }
            answer++;
        }
        return answer;
    }
}