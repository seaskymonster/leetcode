public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while(i < j){
            if(numbers[i] + numbers[j] == target){
                result[0] = i+1; // index is 0 based.
                result[1] = j+1; // index is 0 based.
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