class Solution {
    public int solution(String[] strArr) {
        int[] countArr = new int[30];
        
        
        for(String i : strArr){
            countArr[i.length() -1]++;
        }
        
        int max = 0;
        for(int i: countArr){
            if(max < i) max = i;
        }
        
        int answer = max;
        return answer;
    }
}