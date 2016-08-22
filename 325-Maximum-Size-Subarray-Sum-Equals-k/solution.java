public class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        int[] sum = new int[nums.length + 1];
        sum[0] =  0;
        for(int i = 1 ; i < sum.length; i++){
            sum[i] = sum[i-1] + nums[i - 1];
        }
        
        int maxsize = 0;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < sum.length; i++){
            if(map.containsKey(sum[i] - k)){
                int index = map.get(sum[i] - k);
                maxsize = Math.max(maxsize, i- index);
            }
            
            if(map.containsKey(sum[i])){
                    continue;
            }else{
                    map.put(sum[i], i);
            }
            
        }
        return maxsize;
    }
}