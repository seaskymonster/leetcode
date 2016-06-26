public class NumArray {
    int[] array;
    public NumArray(int[] nums) {
        array = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
           if(i == 0){
               array[i] = nums[0];
           }else{
               array[i] = nums[i] + array[i-1];
           }
        }
    }

    public int sumRange(int i, int j) {
        if(i == 0){
            return array[j];
        }else{
            return array[j]- array[i-1];
        }
    }
}


// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);