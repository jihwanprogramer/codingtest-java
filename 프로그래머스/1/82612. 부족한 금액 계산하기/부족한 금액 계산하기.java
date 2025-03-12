class Solution {
    public long solution(int price, int money, int count) {
        long totalMoney = 0;
        
        for(int i=1;i<=count;i++){
            totalMoney += price*i;
        }
        long answer =totalMoney - money;
        if(answer<=0){
            return 0;
        }
        return answer ;
    }
}