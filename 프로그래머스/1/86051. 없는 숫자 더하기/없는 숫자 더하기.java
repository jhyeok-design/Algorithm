class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for (int i = 1; i <= 9; i++) {
            for (int num : numbers) {
                if (num == i) {
                    sum += i;
                }
            }
    }return 45 - sum;
}
}
