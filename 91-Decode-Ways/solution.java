public class Solution {
    public int numDecodings(String s) {
        int[] dp = new int[s.length()];
        
        dp[0] = 0;
        dp[1] = 1;
        for(int i =2; i <= s.length(); i++){
            if(s.charAt(i-1) != '0'){
                dp[i] += dp[i-1];
            }
            
            int twodigits = (s.charAt(i-2) - '0') * 10 + (s.charAt(i-2) -'0');
            if(twodigits <=26 && twodigits >=10){
                dp[i] += dp[i-2];
            }
            
        }
        return dp[s.length()];
    }
}