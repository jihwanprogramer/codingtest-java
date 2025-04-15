import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        List<Integer> lists = new ArrayList<>();
        for(int i = 0;i<score.length;i++)
        {
            lists.add(score[i]);
            if(lists.size()>k)
            {
                lists.remove(Collections.min(lists));
            }
            
            answer[i] =Collections.min(lists);
        }
        
        return answer;
    }
}