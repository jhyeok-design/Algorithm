class Solution {
    public int solution(int[] a, int[] b) {
        int n = a.length;
        int sum = 0;
            for(int i = 0; i < n; i++){
                sum += a[i]*b[i];
            }
        return sum;
    }
}