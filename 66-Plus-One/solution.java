public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0){
            return digits;
        }
        
        int carry = 0;
        for(int i = digits.length - 1; i >= 0; i--){
            int value = digits[i];
            digits[i] = (value + 1) % 10;
            carry = (value + 1) / 10;
            if(carry == 0) {
                break;
            }
        }
        if(carry == 0) {
            return digits;
        }else{
            int[] result = new int[digits.length+1];
            result[0] = 1;
            for(int i = 1; i < result.length; i++){
                result[i] = digits[i-1];
            }
            return result;
        }
        
    }
}