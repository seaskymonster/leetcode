public class Solution {
    
    // version 1: traversal: ...........................
     // the below method is not right, you can try to save the list...
    // public int minimumTotal(List<List<Integer>> triangle) {
    //     int best = Integer.MAX_VALUE;
    //     dfs(0,0,triangle.get(0).get(0),best,triangle);
    //     return best;
    // }
    
    // public void dfs(int x, int y, int sum, int best, List<List<Integer>> triangle){
    //     if(x == triangle.size() -1){
    //         if(sum < best){
    //             best = sum;
    //         }
    //         return;
    //     }
    //     dfs(x+1, y, sum+triangle.get(x+1).get(y), best, triangle);
    //     dfs(x+1, y+1, sum+triangle.get(x+1).get(y+1), best, triangle);
    // }
    
    //....................................................
    
    // version 2: divide and conquer
    // 算法复杂度是 O(n^2), n 是深度，因为很多点重复遍历，从上到下，一个路径变成两个，1 -> 2 -> 4 -> 8 ...-> 2^n-1
    // 这个TLE
    
        // public int minimumTotal(List<List<Integer>> triangle) {
        //     return dfs(0, 0, triangle);
        // }
        
        // public int dfs(int x, int y, List<List<Integer>> triangle){
        //     System.out.println("x"+x+"y"+y);
        //     if(x == triangle.size() - 1){
        //         return triangle.get(x).get(y);
        //     }
        //     int sumleft = dfs(x+1, y, triangle);
        //     int sumright = dfs(x+1, y+1, triangle);
        //     return triangle.get(x).get(y) + Math.min(sumleft, sumright);
        // }
        
    //version 3: memorization search
        //通过了，看看能不能写成class。 private minTotal
        // public int minimumTotal(List<List<Integer>> triangle) {
        //     int n = triangle.size();
        //     int[][] minSum = new int[n][n];
        //     for(int i = 0; i < n; i++){
        //         for(int j  = 0; j < n; j++){
        //             minSum[i][j] = Integer.MAX_VALUE;
        //         }
        //     }
        //     return dfs(0, 0, triangle, minSum);
        // }
        
        // public int dfs(int x, int y, List<List<Integer>> triangle, int[][] minSum){
        //     if(x == triangle.size() - 1){
        //         return triangle.get(x).get(y);
        //     }
        //     if(minSum[x][y] != Integer.MAX_VALUE){
        //         return minSum[x][y];
        //     }
            
        //     int sumleft = dfs(x+1, y, triangle, minSum);
        //     int sumright = dfs(x+1, y+1, triangle, minSum);
        //     minSum[x][y] = triangle.get(x).get(y) + Math.min(sumleft, sumright);
           
        //     return minSum[x][y];
        // }
        
    //version 4: bottom - up dp.
       public int minimumTotal(List<List<Integer>> triangle) {
           int n = triangle.size();
           int[][] f = new int[n][n]; // state: the minsum from bottom to current position.
           for(int i = 0; i < n; i++){ // initialization: the lowest level minsum
               f[n-1][i] = triangle.get(n-1).get(i);
           }
           for(int i = n-2; i >= 0 ; i--){ // dp
               for(int j = 0; j <= i; j++){ // 这个地方以前写错了，  以前写的是 j < i;
                   f[i][j] = triangle.get(i).get(j) + Math.min(f[i+1][j], f[i+1][j+1]);
               }
           }
           return f[0][0];
        }
    
}