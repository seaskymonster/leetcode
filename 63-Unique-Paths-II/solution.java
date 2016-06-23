public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        int[][] f = new int[m][n];
        
        if(obstacleGrid[0][0] == 0){  // you need to initialize f[0][0] in a right way. it may be a obstacle.
               f[0][0]  = 1;
        }else{
               f[0][0]  = 0;
        }
          
        for(int i = 1 ;i < m ; i++){  // initialize f[i][0]
            if(obstacleGrid[i][0] == 0){ 
               f[i][0]  = f[i-1][0];
            }else{
               f[i][0]  = 0;
            }
        }
        for(int j = 1; j < n; j++){
             if(obstacleGrid[0][j] == 0){ // initialize f[0][j]
               f[0][j]  = f[0][j-1];
            }else{
               f[0][j]  = 0;
            }
        }
        
        for(int i = 1; i < m; i++){
          for(int j = 1; j < n; j++){
            if(obstacleGrid[i][j] == 0){
              f[i][j] = f[i-1][j] + f[i][j-1];
            }else{
               f[i][j]  = 0;
            }
          }
        }
        
        return f[m-1][n-1];
    }
}