class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] sarr = s.split(" ");
        
        for(int index = 0; index < sarr.length; index++){
            if(sarr[index].equals("Z")) answer -= Integer.parseInt(sarr[index-1]);
            else answer += Integer.parseInt(sarr[index]);
        }
        return answer;
    }
}