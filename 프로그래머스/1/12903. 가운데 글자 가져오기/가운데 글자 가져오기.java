class Solution {
    public String solution(String s) {
       int len = s.length();
       int min = len / 2;
           
        if(len % 2 == 0){
            return s.substring(min - 1, min + 1);
        } else {
            return s.substring(min, min + 1);
        }
    }
}