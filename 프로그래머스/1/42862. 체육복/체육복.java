import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n];
        Arrays.fill(clothes, 1);

        // set 활용해 중복 제거
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        for (int l : lost) lostSet.add(l);
        for (int r : reserve) {
            if (lostSet.contains(r)) {
                // 중복 제거: 도난 + 여벌 모두 있는 학생은 제외
                lostSet.remove(r);
            } else {
                reserveSet.add(r);
            }
        }

        // 도난 반영
        for (int l : lostSet) clothes[l - 1]--;

        // 여벌 반영
        for (int r : reserveSet) clothes[r - 1]++;

        // 빌려주기 로직
        for (int i = 0; i < n; i++) {
            if (clothes[i] == 0) {
                if (i > 0 && clothes[i - 1] == 2) {
                    clothes[i]++;
                    clothes[i - 1]--;
                } else if (i < n - 1 && clothes[i + 1] == 2) {
                    clothes[i]++;
                    clothes[i + 1]--;
                }
            }
        }

        // 최종 수업 가능 인원 수
        int answer = 0;
        for (int c : clothes) {
            if (c >= 1) answer++;
        }

        return answer;
    }
}
