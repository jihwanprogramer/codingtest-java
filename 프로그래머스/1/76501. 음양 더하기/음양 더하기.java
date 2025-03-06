class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int index=0;
        for(boolean a:signs)
        {
            if(a==true)
            {
                answer+=absolutes[index];
            }
            else{
                answer-=absolutes[index];
            }
            index++;
            
        }
        return answer;
    }
}