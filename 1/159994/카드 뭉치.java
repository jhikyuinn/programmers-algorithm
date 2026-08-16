class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cards1index = 0;
        int cards2index = 0;
        
        for(int i = 0; i < goal.length; i++){
            if(goal[i].equals(cards1[cards1index])){
                cards1index += (cards1index < cards1.length -1)  ? 1 : 0;
                continue;
            }else if(goal[i].equals(cards2[cards2index])){
                cards2index += (cards2index < cards2.length -1) ? 1 : 0;
                continue;
            }else{
                answer = "No";
                break;
            }
        }
        return answer;
    }
}