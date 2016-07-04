public class Solution {
    public void sortColors(int[] nums) {
        int pt0 = 0;
        int pt1 = 0;
        int pt2 = nums.length-1;
        // 有的时候你不能 i++， 所以下面的程序是错的。
        // for(int i = 0; i < nums.length; i++){
        //     if(pt1 > pt2) break;
        //     if(nums[i] == 0){
        //         if(pt0 == pt1){
        //             pt0++;
        //             pt1++;
        //         }else{
        //              nums[pt0] = 0;
        //              nums[pt1] = 1;
        //              pt0++;
        //              pt1++;
        //         }
        //     }else if(nums[i] == 1){
        //         pt1++;
        //     }else{
        //       int tmp = nums[pt2];
        //       nums[pt2] = nums[i];
        //       nums[i] = tmp;
        //       pt2--;
                
        //     }
        // }
        
        while(pt1 < pt2){
            if(nums[pt1] == 0){
                if(pt0 == pt1){
                    pt0++;
                    pt1++;
                }else{
                   swap(nums, pt0, pt1);
                   pt0++;
                   pt1++;
                }
            }else if(nums[i] == 1){
                pt1++;
            }else{
                swap(nums, pt1, pt2);
                pt2--;
            }
        }
    }
    public void swap(int[] nums, int i, int j){
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }
}