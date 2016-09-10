public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] f = new int[amount +1];
        Arrays.fill(f, -1);
        f[0] = 0;
        for(int i = 1 ; i <= amount; i++){
            for(int j =0; j < coins.length; j++){
                if(i- conis[j] >= 0 && f[i -coins[j]] != -1){
                    f[i] = Math.min(f[i - coins[j]] +1, f[i]);
                }  
            }
        }
        return f[amount];
    }
}