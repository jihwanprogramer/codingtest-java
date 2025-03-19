class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i=0;i<number.length;i++)
        {
            for(int j=i+1;j<number.length;j++)
            {
                for(int g=j+1;g<number.length;g++){
                    if(number[i]+number[j]+number[g]==0)
                    {
                        answer ++;
                    }
                }
            }
        }
        return answer;
    }
}