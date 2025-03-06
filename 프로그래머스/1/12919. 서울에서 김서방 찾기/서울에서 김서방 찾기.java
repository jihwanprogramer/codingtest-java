import java.util.ArrayList;
class Solution {
    public String solution(String[] seoul) {
        String firstAnswer = "김서방은 ";
        String secondAnswer = "에 있다";
       
        ArrayList<String> list1 = new ArrayList<>();
        for(String a:seoul){
            list1.add(a);
        }
        int index = list1.indexOf("Kim");
        return firstAnswer + index + secondAnswer;
    }
}