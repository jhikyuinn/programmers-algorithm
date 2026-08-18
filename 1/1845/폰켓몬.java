import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int count = nums.length / 2;
        nums = Arrays.stream(nums).distinct().toArray();
        int answer = (nums.length > count) ? count: nums.length ;
        return answer;
    }
}