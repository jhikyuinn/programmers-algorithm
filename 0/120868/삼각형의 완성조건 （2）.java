class Solution {
    public int solution(int[] sides) {
        int max = (sides[0] >= sides[1])? sides[0]: sides[1];
        int min = (sides[0] >= sides[1])? sides[1]: sides[0];
        
        int answer = (max+min) - (max - min) - 1;
        return answer;
    }
}