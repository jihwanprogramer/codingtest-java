import java.util.ArrayList;
class Solution {
    public String solution(String[] seoul) { 
        ArrayList<String> list1 = new ArrayList<>();
        for(String a:seoul){
            list1.add(a);
        }
        int index = list1.indexOf("Kim");
        return "김서방은 " + index + "에 있다";
    }
}