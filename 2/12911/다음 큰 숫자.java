class Solution {
    public int solution(int n) {
        
        String binaryString = Integer.toBinaryString(n);
        int testcount = 0;
        
        for(int i = 0 ; i < binaryString.length(); i++){
            if(binaryString.charAt(i) == '1') testcount++;
        }
            
        int answer = n+1;
        while(true){
            int precount = 0;
            String prebinaryString = Integer.toBinaryString(answer);
            for(int i = 0 ; i < prebinaryString.length(); i++){
                if(prebinaryString.charAt(i) == '1') precount++;
            }
            if(testcount == precount) break;
            answer++;
        }
        
        return answer;
    }
}