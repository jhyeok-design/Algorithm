class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n);
        int len = num.length();
        int[] answer = new int[len];
        int i = 0;
        while(n > 0){
            answer[i] = (int)(n % 10);
                n /= 10;
            i++;
        }
        return answer;
    }
}