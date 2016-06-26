public class NumMatrix {
    int[][] array;
    public NumMatrix(int[][] matrix) {
        array = new int[matrix.length][matrix[0].length +1];
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - 1; j++){
                array[i+1][j] = array[i][j] + matrix[i][j];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for(int i = row1; i <= row2; i++){
            sum += array[i][col2+1] - array[i][col1];
        }
    }
}


// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.sumRegion(1, 2, 3, 4);