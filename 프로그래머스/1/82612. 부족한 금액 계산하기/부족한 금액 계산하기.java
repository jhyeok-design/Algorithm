class Solution {
    public long solution(int price, int money, int count) {
        long result = 0;
        for(int i = 1; i <= count; i++){
            result += price*i;
        }
        if (money > result){
            return 0;
        }
        return result - money;
    }
}