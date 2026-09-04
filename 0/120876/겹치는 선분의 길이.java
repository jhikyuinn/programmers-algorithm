class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] counter = new int[201];
        
        for(int i = 0 ; i < 3 ; i++){
            for(int j = lines[i][0] + 100; j <= lines[i][1] + 100 -1; j++){
                counter[j]++;
            }
        }
        
        for(int index = 0; index < 201; index++){
            if(counter[index] > 1){
                answer++;
            }
        }
        
        return answer;
    }
}