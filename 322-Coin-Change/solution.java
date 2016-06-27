public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] f = new int[amount+1]; // f[i] 代表 i这么多钱最少是由多少个coins组成的。  
       
        Arrays.fill(f, Integer.MAX_VALUE);
        f[0] = 0;
        for(int i = 1; i < f.length; i++){
            for(int j = 0; j < coins.length; j++){
                if(i - coins[j] >= 0){
                    if(f[i-coins[j]] != Integer.MAX_VALUE){
                          f[i] = Math.min(f[i], f[i-coins[j]] + 1);
                    }
                }
            }
        }
        return f[amount] == Integer.MAX_VALUE ? -1 : f[amount];
    }
}

// public class Solution {
//     public int coinChange(int[] coins, int amount) {
//         int max = amount + 1;             
//         int[] dp = new int[amount + 1];  
//         Arrays.fill(dp, max);  
//         dp[0] = 0;   
//         for (int i = 1; i <= amount; i++) {
//             for (int j = 0; j < coins.length; j++) {
//                 if (coins[j] <= i) {
//                     dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
//                 }
//             }
//         }
//         return dp[amount] > amount ? -1 : dp[amount];
//     }
// }

