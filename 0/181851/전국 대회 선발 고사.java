import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
                
        int rankindex = 1;
        int rankmulti = 10000;
        
        
        while(rankmulti != 0){
            for(int index = 0; index < rank.length; index++){
                if(rank[index] == rankindex){
                    if(attendance[index] == true){
                        answer += index * rankmulti;
                        rankmulti /= 100;
                        rankindex++;
                        break;
                    }else{
                        rankindex++;
                        break;   
                    }
                }
                    
            }
        }
            
      
        return answer;
    } 
}