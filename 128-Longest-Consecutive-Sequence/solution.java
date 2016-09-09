public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(Integer num: nums){
            set.add(num);
        }
        int longest = 0;
        for(int i =0; i < nums.lenght; i++){
            int down = nums[i] -1;
            while(set.contains(down)){
                set.remove(down);
                down--;
            }
            
            int up = nums[i] + 1;
            while(set.contains(up)){
                set.remove(up);
                up++;
            }
            longest = Math.max(longest, up-down-1);
        }
        return longest;
    }
}