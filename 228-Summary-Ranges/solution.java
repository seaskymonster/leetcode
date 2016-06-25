public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<String>();
        if(nums == null || nums.length == 0){
            return result;
        }
        StringBuilder sb = new StringBuilder();
        boolean newstring = true;
        for( int i = 0; i < nums.length; i++){
            if(newstring){
                sb.append(nums[i]);
                newstring = false;
            }else{
                if(nums[i] != nums[i-1] + 1){
                   sb.append(" ").append(nums[i]);
                   result.add(sb);
                   sb = new StringBuilder();
                   newstring = true;
                }else{
                   continue;
                }
           }
        }
        if(newstring == false){
            result.add(sb);
        }
        
        return result;
        
    }
}