class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int length = numbers.length;
        for(int i=0;i<=length-1;i++)
        {
           answer+=numbers[i];
        }
        double result =answer/(double)numbers.length;
        return answer/length;
    }
}