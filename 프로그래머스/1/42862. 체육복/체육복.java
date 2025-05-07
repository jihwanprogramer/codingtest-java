import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int[] check = new int[n];
        Arrays.fill(check,1);
        
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> revSet = new HashSet<>();
        
        for(int i : lost){
            lostSet.add(i);
        }
        
        for(int s:reserve){
            if(lostSet.contains(s)){
                lostSet.remove(s);
            }else{
                revSet.add(s);
            }
        }
        
        for(int i: lostSet){
            check[i-1] --;
        }
        
        for(int s:revSet){
            check[s-1] ++;
        }
        
        for(int i=0; i< n ; i++){
            if(check[i] == 0){
               if(i>0 && check[i-1] == 2){
                check[i-1]--;
                check[i]++;
              }else if (i<n-1 && check[i+1] == 2){
                check[i+1]--;
                check[i]++;
               }
            }
        }
        
        int answer = 0;
        for (int c : check) {
            if (c >= 1) answer++;
        }
        
        
        return answer;
  }
}
