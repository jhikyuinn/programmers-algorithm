class Solution {
    public String solution(String polynomial) {
        String[] tokens = polynomial.split(" ");
    
        int xvalue = 0;
        int value = 0;
        
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].contains("x")) {
                tokens[i] = tokens[i].replace("x","").trim();
                xvalue += (tokens[i].equals("")) ? 1 : Integer.parseInt(tokens[i]);
            }else if(tokens[i].contains("+")){
                continue;
            }else{
                value += Integer.parseInt(tokens[i]);
            }
        }
        
        String finalxvalue = (xvalue > 1) ? String.valueOf(xvalue) + "x" : "";
        if(xvalue == 1) finalxvalue = "x";
        String finaloperator = (xvalue > 0 && value > 0) ? " + ":"";
        String finalvalue = (value > 0) ? String.valueOf(value) : "";
        
        String answer = finalxvalue + finaloperator + finalvalue;
        return answer;
    }
}