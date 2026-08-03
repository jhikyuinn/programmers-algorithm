class Solution {
    public int solution(int[] date1, int[] date2) {
        
        long data1sum = date1[0]*10000 + date1[1]*100 + date1[2];
        long data2sum = date2[0]*10000 + date2[1]*100 + date2[2];
        
        System.out.println(data1sum+" "+ data2sum);
        
        int answer = (data1sum < data2sum)? 1 :0;
        return answer;
    }
}