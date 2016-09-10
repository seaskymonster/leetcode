public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] f = new int[amount +1];
        Arrays.fill(f, -1);
        f[0] = 0;
        for(int i = 1 ; i <= amount; i++){
            for(int j =0; j < coins.length; j++){
                System.out.println('i'+i);
                System.out.println('j'+j);
                if(i- coins[j] >= 0 && f[i -coins[j]] != -1){
                    if(f[i] == -1){
                        f[i] = f[i - coins[j]] + 1;
                    }else{
                        f[i] = Math.min(f[i - coins[j]] +1, f[i]);
                    }
                }  
            }
        }
        return f[amount];
    }
}