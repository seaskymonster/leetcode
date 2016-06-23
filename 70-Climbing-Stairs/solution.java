public class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int[] f = new int[n+1]; // f[i] represents different ways to the i step
        for(int i = 3; i <= n+1; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n+1];
    }
}