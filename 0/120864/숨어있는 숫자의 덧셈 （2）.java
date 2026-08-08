class Solution {
    public int solution(String my_string) {
        String removemy_string = my_string.replaceAll("[A-z]+"," ").trim();
        String[] numarr = removemy_string.split(" ");
        System.out.println(numarr.length);
        
        int answer = 0;
        if(numarr.length == 1 && numarr[0] == "") return 0;
        for(String num : numarr){
            answer += Integer.parseInt(num);
        }
        
        return answer;
    }
}