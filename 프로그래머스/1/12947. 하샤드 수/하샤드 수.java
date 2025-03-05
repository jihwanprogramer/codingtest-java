class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int index = String.valueOf(x).length();
        int sum= 0;
        int num= x;
        
        for(int i=0;i<index;i++)
        {
            sum+=num%10;
            num/=10;
        }
        
        if(x%sum ==0)
        {
            answer =true;
        }
        else{
            answer =false;
        }
        return answer;
    }
}