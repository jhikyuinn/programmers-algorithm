class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        
        int count = 0;
        for(int i = 0; i < num_list.length; i++){
            answer[i/n][count] = num_list[i];
            count++;
            if(count == n) count = 0;
        }
        return answer;
    }
}