class Solution {
    public String solution(int a, int b) {
        String answer = "";

        int value = b;
        for(int i = 1; i < a ; i++){
            if(i == 4 || i == 6 || i == 9 || i == 11 ){
                value += 30;
            }else if( i == 2){
                value += 29;
            }else{
                value += 31;
            }
        }
        System.out.println(value);
        
        switch(value % 7){
            case 1:
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3:
                answer = "SUN";
                break;
            case 4:
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            case 6:
                answer = "WED";
                break;
            case 0:
                answer = "THU";
                break;
        }
        
        return answer;
    }
}