public class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 0;
        for(int i = digits.length-1; i >= 0; i--){
            int sum = digits[i] + carry;
            digits[i] = sum%10;
            carry = sum/10;
        }
        if(carry == 0){
            return digits;
        }else{
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for(int j = 1; j < result.length; j++){
                result[j] = digits[j-1];
            }
        }
        return result;
    }
}