public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] f = new int[nums.length];
        int[] q = new int[nums.length];
        int product = 1;
        for(int i=0; i<nums.length; i++){
            f[i] = product;
            product = product*nums[i];
        }
        int product2 = 1;
        for(int j=nums.length-1; j>=0; j--){
            q[j] = product2;
            product2 = product2*nums[j];
        }
        
        for(int i = 0; i < nums.length; i++){
                f[i] = f[i]*q[i];
        }
        return f;
    }
}