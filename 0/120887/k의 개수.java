
class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String target = String.valueOf(k);
        
        for (int index = i; index <= j; index++) {
            String numStr = String.valueOf(index);
            for (int c = 0; c < numStr.length(); c++) {
                if (String.valueOf(numStr.charAt(c)).equals(target)) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}