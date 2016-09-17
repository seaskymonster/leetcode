public class Solution {
    public int trailingZeroes(int n) {
        if(n < 1) return 0;
        int count = 0;
        for(long i = 5; n/i >= 1; i *= 5){
            count += n/i;
        }
        return count;
    }
}