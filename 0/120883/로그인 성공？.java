class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "fail";
        for(int index = 0; index < db.length; index++){
            if(id_pw[0].equals(db[index][0])){
                answer = (id_pw[1].equals(db[index][1])) ? "login": "wrong pw";
            }
        }
        return answer;
    }
}