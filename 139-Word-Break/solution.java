public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1]; // dp[i] means the substring(0, i) is a word
        dp[0] = true;
        for(int i =1; i<= s.length(); i++){
            for(int j = i-1; j >= 0; j--){
                if(set.contains(s.substring(j, i))){
                    if(dp[j] == true){
                        dp[i] = true;
                    }
                }
            }
        }
        return dp[s.length()];
    }
}