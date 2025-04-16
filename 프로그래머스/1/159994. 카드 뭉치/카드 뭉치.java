class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i1 = 0;
        int i2 = 0;
        
        for(String g : goal){
            if(i1 < cards1.length && cards1[i1].equals(g)){
                i1++;
            }else if(i2 < cards2.length && cards2[i2].equals(g)){
                i2++;
            }else{
                return "No";
            }
        }
        
        return "Yes";
        
    
    }
}