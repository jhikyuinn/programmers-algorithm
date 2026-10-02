class Solution {
    public int solution(int[] nums) {
        
        int answer = 0;
        
        int n = nums.length;

        for (int a = 0; a < n; a++){
          for (int b = a + 1; b < n; b++){
            for (int c = b + 1; c < n; c++) {
                boolean isPrime = true;
                for (int j = 2; (long) j * j <= (nums[a]+nums[b]+nums[c]); j++) {
                    if ((nums[a]+nums[b]+nums[c]) % j == 0) { 
                        isPrime = false;
                        break; 
                    }
                }
                if (isPrime) answer++;
            }
          }
        }

        return answer;
    }
}