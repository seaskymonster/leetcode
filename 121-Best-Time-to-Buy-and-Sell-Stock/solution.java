public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) return 0;
        int result = 0;
        int curMin = prices[0];
        for(int i =1; i < prices.length; i++){
            result = Math.max(result, prices[i] - curMin);
            curMin = Math.min(curMin, prices[i]);
        }
        return result;
    }
}