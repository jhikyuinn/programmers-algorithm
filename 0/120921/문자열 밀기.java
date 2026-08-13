import java.util.*;

class Solution {
    public int solution(String A, String B) {
        List <String> stringlist = new ArrayList<String>(Arrays.asList(A.split("")));
        
        int count = 0;
        while(true){
            if(String.join("", stringlist).equals(B)) {break;}
            stringlist.addFirst(stringlist.get(A.length()-1));
            stringlist.removeLast();
            count+=1;
            if(count == stringlist.size()) {count = -1; break;}
        }
        
        int answer = count;
        return answer;
    }
}