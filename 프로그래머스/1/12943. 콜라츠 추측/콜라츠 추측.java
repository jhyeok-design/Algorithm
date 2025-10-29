class Solution {
    public int solution(int num) {
        int answer = 0;
        long num1 = num;
        for (int i = 0; i < 500; i++) {
            if (num1 == 1) {
                return i;
            } else if (num1 % 2 == 0) {
                num1 /= 2;
            } else {
                num1 = num1 * 3 + 1;
            }
        }
        return -1;
    }
}