class Solution {
    public int solution(int[] nums) {
        int checknum = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int l = j + 1; l < nums.length; l++) {
                    int num = nums[i] + nums[j] + nums[l];
                    boolean isNotPrime = false;
                    for (int k = 2; k <= Math.sqrt(num); k++) {
                        if (num % k == 0) {
                            isNotPrime = true;
                            break;
                        }
                    }
                    if (!isNotPrime) {
                        checknum++;
                    }
                }
            }
        }
        return checknum;
    }
}
