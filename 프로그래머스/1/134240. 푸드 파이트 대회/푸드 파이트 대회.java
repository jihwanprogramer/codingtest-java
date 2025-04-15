import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] food) {
        List<Integer> arrays = new ArrayList<>();
        
        for (int i = 0;i < food.length; i++) {
            int num = food[i] / 2;
            for (int j = 0; j < num; j++) {
                arrays.add(i); 
            }
        }

        List<Integer> reversed = new ArrayList<>(arrays);
        Collections.reverse(reversed); 

        arrays.add(0);
        
        arrays.addAll(reversed);

        String result = "";

        return arrays.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
