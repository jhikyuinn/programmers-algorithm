
class Solution {
    public int[] solution(int[] arr) {
        
        int value = (int) Math.ceil(Math.log(arr.length) / Math.log(2));
        int[] answer = new int[(int)Math.pow(2,value)];
        
        for(int i = 0; i < arr.length; i++){
            answer[i] = arr[i];
            System.out.println(answer[i]);
        }
        return answer;
    }
}