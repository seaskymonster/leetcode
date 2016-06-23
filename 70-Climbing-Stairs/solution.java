public class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int[] f = new int[n+1]; // f[i] represents different ways to the i step
        f[1] = 1;
        f[2] = 2; // remeber to initialize f[1] f[2]
        for(int i = 3; i <= n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}