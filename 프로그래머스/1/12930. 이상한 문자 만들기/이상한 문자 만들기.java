class Solution {
public String solution(String s) {
String answer = "";
String[] answerArray = s.split(" ",-1);
String[] result;
for(int i=0;i<answerArray.length;i++){
result=answerArray[i].split("");


        for(int j=0;j<result.length;j++){
            if(j%2==0){
                result[j] = result[j].toUpperCase();
            }
            else{
                result[j] = result[j].toLowerCase();
            }
        }
        answerArray[i] = String.join("", result);
    }
    answer = String.join(" ",answerArray);
    return answer;
}
}