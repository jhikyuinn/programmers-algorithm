class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int plus = 0;
        for(int i = 1; i < num; i++){
            plus+=i;
        }
        
        int index = -100;
        while(true){
            if(index * num + plus == total) break;
            index++;
        }
        
        int count = 0;
        for(int i = index ; i < index + num; i++){
            answer[count++] = i;
        }
        return answer;
    }
}