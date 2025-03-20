class Solution {
    public int solution(String t, String p) {
        int count = 0;
        for(int i=0;i<=t.length()-p.length();i++){
            String tmp = t.substring(i,i+p.length());
            if(Long.parseLong(p)>=Long.parseLong(tmp)) {
                count++;
              }
        }
        
        return count;
    
    }
            
}
