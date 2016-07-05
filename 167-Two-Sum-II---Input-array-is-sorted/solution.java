public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while(i < j){
            if(numbers[i] + numbers[j] == target){
                int[0] = i;
                int[1] = j;
                return result;
            }else if (numbers[i] + numbers[j] > target){
                j--;
            }else{
                i++;
            }
        }
        
        return result;
    }
}