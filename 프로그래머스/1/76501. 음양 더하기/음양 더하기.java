class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int total = 0;
        for (int i = 0; i < absolutes.length; i++){
            if(signs[i]){
                total += absolutes[i];
            } else {
                total -= absolutes[i];
            }
        }
        return total;
    }
}