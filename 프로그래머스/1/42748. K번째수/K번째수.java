import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0;i<commands.length;i++){
            List<Integer> lists = new ArrayList<>();
            for(int j=commands[i][0]-1;j<=commands[i][1]-1;j++){
                lists.add(array[j]);
            }
            Collections.sort(lists);
            answer[i]=lists.get(commands[i][2]-1);
        }
        return answer;
    }
}