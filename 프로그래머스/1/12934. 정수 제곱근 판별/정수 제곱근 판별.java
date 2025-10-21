class Solution {
    public long solution(long n) {
        double num = Math.sqrt(n);
        if (num == (long)num) {
            long x = (long)num;
            return (x + 1) * (x + 1);
        } else {
            return -1;
        }
    }
}
