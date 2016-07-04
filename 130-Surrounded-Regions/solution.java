public class Solution {
    public void solve(char[][] board) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j <board[0].length; j++){
                if(i == 0 || i == board.length -1 || j == 0 ||j == board[0].length-1){
                    if(board[i][j] == 'O'){
                        dfs(board, i ,j);
                    }
                }
            }
        }
        
        //  for(int i = 0; i < board.length; i++){
        //     for(int j = 0; j <board[0].length; j++){
        //          if(board[i][j] == '*'){
        //                 dfs(board, i ,j);
        //           }
        //     }
        // }
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j <board[0].length; j++){
                 if(board[i][j] == '*'){
                     board[i][j] = 'O';
                  }else if(board[i][j] == 'O'){
                     board[i][j] = 'X';
                  }
            }
        }
    }
    
    public void dfs(char[][] board, int i, int j){
         if(i < 0 || j < 0 || i >= board.length || j >= board[0].length){
            return;
        }
        if(board[i][j] == '*' || board[i][j] == 'X'){
            return;
        }
        if(board[i][j] == 'O'){
            board[i][j] = '*';
            if(i-1>0) dfs(board, i-1, j);
            if(i+1< board.length)dfs(board, i+1, j);
            if(j-1>0)dfs(board, i, j-1);
            if(i+1< board[0].length)dfs(board, i, j+1);
        }
        
    }
}