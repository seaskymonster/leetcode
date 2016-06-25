public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        if(nums == null || nums.length == 0){
            return result;
        }
        int start = 0;
        StringBuilder sb = new StringBuilder();
        for( int i = 0; i < nums.length; i++){
           if(nums[i] != nums[i-1] + 1 || i == nums.length-1){
                sb.append(nums[start])
                if(start != i){
                   append("->").append(nums[i]);
                }
                result.add(sb.toString());
                sb = new StringBuilder();
                start = i+1;
             }else{
                   continue;
             }
        }
       
        return result;
        
    }
}