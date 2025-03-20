class Solution {
    public int solution(int[][] sizes) {
        int maxLen = 0;
        int maxHei = 0;
        for(int i=0;i<sizes.length;i++){
            int len = Math.max(sizes[i][0],sizes[i][1]);
            int hei = Math.min(sizes[i][0],sizes[i][1]);
            
            maxLen = Math.max(len,maxLen);
            maxHei = Math.max(hei,maxHei);
        }
        return maxLen * maxHei ;
    }
}