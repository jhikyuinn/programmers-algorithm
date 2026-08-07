class Solution {
    public int solution(String[] babbling) {
        String[] fourword = new String[]{"aya","ye","woo","ma"};
        int answer = 0;
        
        for(String i : babbling){
            for(int j = 0; j < fourword.length; j++){
                i=i.replace(fourword[j]," ");
            }
            if(i.trim().length() == 0 ) answer++;
            
        }
        
        return answer;
    }
}