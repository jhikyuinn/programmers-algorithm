import java.util.*;

class Solution {
    public int solution(String binomial) {
        int answer = 0;
        List<String> list = new ArrayList<>(Arrays.asList(binomial.split("")));

        for (int i = 0; i < list.size(); i++) {
            String c = list.get(i);
            if (c.equals("+")) {
                int a = Integer.parseInt(binomial.substring(0, i).trim());
                int b = Integer.parseInt(binomial.substring(i + 1).trim());
                answer = a + b;
            } else if (c.equals("-")) {
                int a = Integer.parseInt(binomial.substring(0, i).trim());
                int b = Integer.parseInt(binomial.substring(i + 1).trim());
                answer = a - b;
            } else if (c.equals("*")) {
                int a = Integer.parseInt(binomial.substring(0, i).trim());
                int b = Integer.parseInt(binomial.substring(i + 1).trim());
                answer = a * b;
            }
        }                    

        
        return answer;
    }
}