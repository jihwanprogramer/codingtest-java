import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> maps = new HashMap<>(); // 마지막 인덱스를 저장할 HashMap
        
        for (int i = 0; i < s.length(); i++) {
            if (!maps.containsKey(s.charAt(i))) {
                answer[i] = -1;
                maps.put(s.charAt(i),i);
                continue;
            }
            
            answer[i]= i-maps.get(s.charAt(i));
            maps.put(s.charAt(i),i);
        }
        
        return answer;
    }
}
