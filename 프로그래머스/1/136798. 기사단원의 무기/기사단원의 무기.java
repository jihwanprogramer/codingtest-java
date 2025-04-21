import java.util.Arrays;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] list = new int[number];
        
        for(int i=1;i<=number;i++){
            int count = 0;
            for(int j=1;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    count+=(j*j==i)?1:2;
                }
            }
            if(count>limit){
                count = power;
            }
            list[i-1] = count;
        }
        return Arrays.stream(list).sum();
    }
}