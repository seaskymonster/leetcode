public class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] result = new int[length];
        for(int[] update: updates){
            int start = update[0];
            int end = update[1];
            int number = update[2];
            result[start] += number;
            if(end +1 <= length -1){
                 result[++end] -= number;
            }
        }
        
        for(int i = 1; i <= length-1; i++){
            result[i] = result[i-1]+result[i];
        }
        return result;
    }
}