public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(nums.length == 0){
            return result;
        }
        if(nums.length == 1){
            result.add(nums[0]);
            return result;
        }

        int count1 = 0;
        int count2 = 0;
        int candidate1 = 0;
        int candidate2 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == candidate1){ // first to make sure whether it is equal to an candidate before.
                count1++;
            }else if(nums[i] == candidate2){
                count2++;
            }else if(count1 == 0) {
                candidate1 = nums[i];
                count1++;
            }else if(count2 == 0){
                candidate2 = nums[i];
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        int countfor1 = 0;
        int countfor2 = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] == candidate1){
                countfor1++;
            }else if(nums[j] == candidate2){
                countfor2++;
            }
        }
        if(countfor1 >= nums.length/3 +1){
            result.add(candidate1);
        }
        if(countfor2 >= nums.length/3 +1){
            result.add(candidate2);
        }
        return result;
      
    }
}