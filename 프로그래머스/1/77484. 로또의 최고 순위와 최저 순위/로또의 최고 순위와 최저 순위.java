import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        HashSet<Integer> sets = new HashSet<Integer>(Arrays.asList(Arrays.stream(win_nums).boxed().toArray(Integer[]::new)));
        int count = 0;
        int max = 0;
        for(int i=0;i<lottos.length;i++){
            if(sets.contains(lottos[i])){
                count++;
            }
            
            if(lottos[i]==0){
                max ++;
            }
        }
        
        List<Integer> lists =Arrays.asList(6,6,5,4,3,2,1);
        int[] result= new int[]{lists.get(count+max),lists.get(count)};
        
        return result;
    }
}