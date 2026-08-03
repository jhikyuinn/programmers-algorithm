import java.math.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger biga = new BigInteger(a);
        BigInteger bigb = new BigInteger(b);
        String answer = String.valueOf(biga.add(bigb));
        return answer;
    }
}