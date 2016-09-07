public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n= matrix[0].length;
        int i = m-1;
        int j =0;
        while( i>= 0 && i < m && j <n && j >= 0){
            if(matrix[i][j] > target){
               i--; 
            }else if (matrix[i][j] < target){
               j++;
            }else{
                return true;
            }
        }
        return false;
    }
}