public class Solution {
    // public List<Integer> spiralOrder(int[][] matrix) {
    //     List<Integer> result=new ArrayList<Integer>();
    //     int m=matrix.length;
    //     if(m==0) return result;
    //     int n=matrix[0].length;
    //  /*   if(m==1){
    //         for(int j=0;j<n;j++){
    //             result.add(matrix[0][j]);
    //         }
    //         return result;
    //     }
        
    //     if(n==1){
    //         for(int j=0;j<m;j++){
    //             result.add(matrix[j][0]);
    //         }
    //         return result;
    //     } */
       
    //     int layer=(Math.min(m,n)==1)?1:Math.min(m,n)-1;
    //     for(int i=0;i<layer;i++){
    //         int offset1=n-1-2*i;//the offset in horizontal... cao ni ma....
    //         int offset2=m-1-2*i;// the offset in vertical..
            
    //         if(offset1==0){
    //             for(int j=0;j<=offset2;j++){
    //             result.add(matrix[i+j][i]);
    //             }
    //             break;
    //         }
    //         if(offset2==0){
    //           for(int j=0;j<=offset1;j++){
    //             result.add(matrix[i][i+j]);
    //           } 
    //           break;
    //         }
    //         for(int j=0;j<offset1;j++){
    //             result.add(matrix[0+i][0+i+j]);
    //         }
    //         for(int j=0;j<offset2;j++){
    //             result.add(matrix[0+i+j][n-1-i]);
    //         }
    //         for(int j=0;j<offset1;j++){
    //             result.add(matrix[m-1-i][n-1-i-j]);
    //         }
    //         for(int j=0;j<offset2;j++){
    //             result.add(matrix[m-1-i-j][i]);
    //         }
    //     }
    //     return result;
    // }
    
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<Integer>();
        int count = 0;
        while(m - 2*count > 0 && n - 2*count > 0){
        for(int j = count ; j < n-count; j++){
            result.add(matrix[count][j]);
        }
        for(int i = count+1; i < m-count; i++){
            result.add(matrix[i][n-1-j]);
        }
        if(m - 2*count == 1 || n - 2*count == 1) break; // 只剩一行或者一列，下半部分操作不用了。
        for(int j = n-1-count-1; j >= count; j--){
            result.add(matrix[m-1-count][j]);
        }
        for(int i = m-1-count-1; i >= count+1; i--){
            result.add(matrix[i][count]);
        }
        count++;
        } 
        
        return result;
       
    }
}