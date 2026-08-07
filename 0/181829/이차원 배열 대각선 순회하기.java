class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        int n = board.length;
        for (int i = 0; i <= k && i < n; i++) {
            int m = board[i].length;
            for (int j = 0; j <= k - i && j < m; j++) {
                answer += board[i][j];
            }
        }
        return answer;
    }
}