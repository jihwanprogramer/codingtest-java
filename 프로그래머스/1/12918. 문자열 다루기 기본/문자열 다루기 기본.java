class Solution {
    public boolean solution(String s) {
        boolean answer = true;
         if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        
        char check;
        for(int i=0;i<s.length();i++){
            check=s.charAt(i);
            if(!(check >='0'&& check<='9')){
                answer = false;
            }
        }
        return answer;
    }
}