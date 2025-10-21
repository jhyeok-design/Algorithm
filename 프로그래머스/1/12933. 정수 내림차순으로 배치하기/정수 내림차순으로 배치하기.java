import java.util.*;

class Solution {
    public long solution(long n) {
        List<Long> compare = new ArrayList<>();
        
        while (n > 0) {
            compare.add(n % 10);
            n /= 10;
        }

        compare.sort(Collections.reverseOrder());
        
        long answer = 0;
        for (int i = 0; i < compare.size(); i++) {
            answer = answer * 10 + compare.get(i);
        }

        return answer;
    }
}
