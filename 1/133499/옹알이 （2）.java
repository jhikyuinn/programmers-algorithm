class Solution {
    public int solution(String[] babbling) {
        String[] only = new String[]{"aya","ye","woo","ma"};
        
        int answer = 0;
        
        for(String bab : babbling){
            for(String i :only){
                if(bab.contains(i)) bab = bab.replace(i, " " + i + " ");
                if(bab.matches(".*(?<! ) {2}(?! ).*")) { break;}
                else{ bab = bab.replace(i, " ").trim();}

                 if(bab.equals("")) {
                    answer++;
                    break;
            }
            }
           
            
        }
        
        return answer;
    }
}