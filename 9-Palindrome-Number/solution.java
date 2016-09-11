public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int reverse = 0;
        int orignal = x;
        while(x >= 1){
            reverse = reverse * 10 + x%10;
            x = x/10;
        }
        
        return reverse == orignal;
    }
}