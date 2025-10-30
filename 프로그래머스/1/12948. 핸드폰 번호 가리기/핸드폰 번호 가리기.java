class Solution {
    public String solution(String phone_number) {
        
        String star = "*".repeat(phone_number.length() - 4);

        return star + phone_number.substring(phone_number.length() - 4);
    }
}
