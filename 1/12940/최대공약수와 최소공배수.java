class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        System.out.println(Math.min(n,m));
        for(int i = 1; i <= Math.min(n,m); i++){
            if(n % i == 0 && m % i == 0){
                answer[0] = i;
            }
        }
        
         for(int i = m; i <= n*m; i++){
            if(i % m == 0 && i % n == 0){
                answer[1] = i;
                break;
            }
        }
        
        return answer;
    }
}