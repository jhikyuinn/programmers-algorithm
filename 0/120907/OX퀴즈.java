class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int index = 0; index < quiz.length; index++){
            String[] tokens = quiz[index].split(" ");
            
            int x = Integer.parseInt(tokens[0]);
            String op = tokens[1];
            int y = Integer.parseInt(tokens[2]);
            int z = Integer.parseInt(tokens[4]);
            
            if(op.equals("+")){
                if(x + y == z) answer[index] = "O";
                else answer[index] = "X";
            }else{
                if(x - y == z) answer[index] = "O";
                else answer[index] = "X";
            }
           
        }
        return answer;
    }
}