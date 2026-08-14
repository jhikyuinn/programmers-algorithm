class Solution {
    public int[] solution(int[][] score) {
        
        double[] avgscore = new double[score.length];
        for(int i = 0; i < score.length; i++){
            avgscore[i] = (score[i][0] + score[i][1])/2.0;
        }
        
        int[] answer = new int[score.length];
        
        for(int i = 0; i < score.length;i++){
            int rank = 1;
            for(int j = 0; j < score.length; j++){
                if(avgscore[i] < avgscore[j]){
                    rank++;
                }
            }
            answer[i] = rank ;
        }
        
        return answer;
    }
}