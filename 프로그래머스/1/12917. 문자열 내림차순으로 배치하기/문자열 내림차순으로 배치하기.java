import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] answerList= s.toCharArray();
        Arrays.sort(answerList);
        
        for(int i= answerList.length-1;i>=0;i--)
        {
            answer+=answerList[i];
        }
        
        return answer;
        
    }
}