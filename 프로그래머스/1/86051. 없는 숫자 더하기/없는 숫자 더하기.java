import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int[] result = {1,2,3,4,5,6,7,8,9};
        int answer=Arrays.stream(result)
                         .filter(num ->Arrays.stream(numbers).noneMatch(n->n==num))
                         .sum();
        
        return answer;
    }
}