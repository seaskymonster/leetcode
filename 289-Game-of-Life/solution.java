public class Solution {
    public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0){
            return;
        }
        int m = board.length;
        int n = board[0].length;
        for(int i = 0 ; i < m; i++){
            for(int j = 0; j < n; j++){
                int neighbors = neighbors(board, i, j);
                if(board[i][j] == 0){
                    if(neighbors == 3){
                        board[i][j] = 2;
                    }
                }else{
                    if(neighbors == 2 || neighbors ==3){
                        board[i][j] = 3;
                    }
                }
            }
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = board[i][j]>>1;
            }
        }
    }
    
    public int neighbors(int[][] board, int i, int j){
        int result = 0;
        for(int k = i-1; k <= i+1 ;k++){
            for(int l = j-1; j <= j+1; j++){
                if(k>=0 && k <= board.length-1 && l >=0 && l<= board[0].length-1){
                    if((board[k][l]&1) == 1){
                       result++;
                    }
                }
            }
        }
        if((board[i][j] & 1) ==1){
            result--;
        }
        return result;
    }
}