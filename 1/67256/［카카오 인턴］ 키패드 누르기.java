class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();

        int[] left = {3, 0};   
        int[] right = {3, 2};  

        for (int num : numbers) {
            int[] pos = getPos(num);

            if (pos[1] == 0) {         
                sb.append("L");
                left = pos;
            } else if (pos[1] == 2) {    
                sb.append("R");
                right = pos;
            } else {                     
                int dL = Math.abs(left[0] - pos[0]) + Math.abs(left[1] - pos[1]);
                int dR = Math.abs(right[0] - pos[0]) + Math.abs(right[1] - pos[1]);

                if (dL < dR || (dL == dR && hand.equals("left"))) {
                    sb.append("L");
                    left = pos;
                } else {
                    sb.append("R");
                    right = pos;
                }
            }
        }
        return sb.toString();
    }

    private int[] getPos(int num) {
        if (num == 0) return new int[]{3, 1};
        return new int[]{(num - 1) / 3, (num - 1) % 3};
    }
}