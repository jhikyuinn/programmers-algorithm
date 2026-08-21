class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        for(String i : keyinput){
            if(i.equals("left")) answer[0]--;
            else if(i.equals("right")) answer[0]++;
            else if(i.equals("up")) answer[1]++;
            else answer[1]--;
            
            if((-1 * (board[0]/2)) > answer[0] || answer[0] > board[0]/2) answer[0] = (answer[0] < 0) ? (-1) * board[0]/2 : board[0]/2;
            else if((-1 * (board[1]/2)) > answer[1] || answer[1] > board[1]/2) answer[1] = (answer[1] < 0) ? (-1) * board[1]/2 : board[1]/2;
        }
        
        return answer;
    }
}