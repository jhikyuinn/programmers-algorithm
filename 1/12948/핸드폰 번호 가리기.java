class Solution {
    public String solution(String phone_number) {
        int totallength = phone_number.length();
        String answer = phone_number.substring(0,totallength-4).replaceAll("[0-9]","*")+phone_number.substring(totallength-4,totallength);
        return answer;
    }
}