class Solution {
    public int[] solution(int[] arr) {
        int firstindex = -1;
        int lastindex = -1;
        
        for(int index = 0; index < arr.length; index++){
            if(arr[index]==2){
                if(firstindex == -1) firstindex = index;
                else lastindex = index;
            }
        }
        
        
        if(firstindex == -1) return new int[]{-1};
        if(lastindex == -1) lastindex=firstindex;
        
        int[] answer = new int[lastindex-firstindex+1];
        for(int i = 0; i < answer.length; i++){
            answer[i]=arr[firstindex+i];
        }
        return answer;
    }
}