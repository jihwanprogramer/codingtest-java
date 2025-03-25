import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String result = "";
        String round = "";

        Map<String, String> numberMap = new HashMap<>();
        numberMap.put("zero", "0");
        numberMap.put("one", "1");
        numberMap.put("two", "2");
        numberMap.put("three", "3");
        numberMap.put("four", "4");
        numberMap.put("five", "5");
        numberMap.put("six", "6");
        numberMap.put("seven", "7");
        numberMap.put("eight", "8");
        numberMap.put("nine", "9");

        for (char a : s.toCharArray()) {
            if (Character.isDigit(a)) {
                result += a;
                round = ""; 
            } else if (Character.isAlphabetic(a)) {
                round += a; 
                if (numberMap.containsKey(round)) {
                    result += numberMap.get(round); 
                    round = ""; 
                }
            }
        }

        answer = Integer.parseInt(result);
        return answer;
    }
}
