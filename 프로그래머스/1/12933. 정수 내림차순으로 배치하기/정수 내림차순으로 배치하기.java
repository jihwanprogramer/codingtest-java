class Solution {
    public long solution(long n) {
        long answer = 0;
        int index = String.valueOf(n).length();
        int[] num = new int[index];
        
        // 숫자를 배열에 저장
        for (int i = 0; i < index; i++) {
            num[i] = (int) (n % 10);
            n /= 10;
        }
        
        // 배열 정렬 (버블 정렬 방식)
        for (int i = 0; i < index - 1; i++) {
            for (int j = 0; j < index - 1 - i; j++) {
                if (num[j] < num[j + 1]) {
                    // Swap
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        
        // 배열을 다시 숫자로 변환
        for (int i = 0; i < index; i++) {
            answer = answer * 10 + num[i];
        }
        
        return answer;
    }
}
