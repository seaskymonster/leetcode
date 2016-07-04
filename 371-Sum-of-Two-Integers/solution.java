public class Solution {
    public int getSum(int a, int b) {
        if(b==0){
            return a; // 这个也是 终止条件
        }
        int sum = a^b;
        int carry = (a&b)<<1;
        return getSum(sum, carry);
    }
}