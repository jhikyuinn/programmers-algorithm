class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i = 0; i < photo.length; i++){
            for(int j = 0 ; j < photo[i].length; j++){
                for(int itemindex = 0; itemindex < name.length; itemindex++){
                    if(name[itemindex].equals(photo[i][j])){
                        answer[i] = answer[i] + yearning[itemindex];
                    }
                }
            }
        }
        return answer;
    }
}