import java.util.*;

class Solution {
    public int solution(int[] nums) {
        List<Integer> lists = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int l=j+1;l<nums.length;l++){
                    int num = nums[i]+nums[j]+nums[l];
                    lists.add(num);
                }
            }
        }
        
        for(int i=lists.size()-1;i>=0;i--)
        {
             int count =0;
            for(int j=1;j<=lists.get(i);j++){
                if(lists.get(i)%j==0){
                    count ++;
                }
         }
            if(count!=2){
                lists.remove(i);        
            }
            
        }


        return lists.size();
    }
}