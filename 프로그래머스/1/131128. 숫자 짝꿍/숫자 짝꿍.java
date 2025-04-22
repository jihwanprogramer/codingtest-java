class Solution {
    public String solution(String X, String Y) {
        int[] xCount = new int[10];
        int[] yCount = new int[10];

        for (char ch : X.toCharArray()) {
            xCount[ch - '0']++;
        }

        for (char ch : Y.toCharArray()) {
            yCount[ch - '0']++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            int minCount = Math.min(xCount[i], yCount[i]);
            for (int j = 0; j < minCount; j++) {
                sb.append(i);
            }
        }

        if (sb.length() == 0) return "-1";          
        if (sb.charAt(0) == '0') return "0";       
        
        return sb.toString();
    }
}