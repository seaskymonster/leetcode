public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        
        HashSet<Character> set = new HashSet<Charcter>();
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] != '.'){
                    if(set.contains(board[i][j]){
                        return false;
                    }else{
                        set.add(board[i][j]);
                    }
                }
            }
            set.clear();
        }
        
        set.clear();
         for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(board[j][i] != '.'){
                    if(set.contains(board[j][i]){
                        return false;
                    }else{
                        set.add(board[j][i]);
                    }
                }
            }
            set.clear();
        }
        
        set.clear();
        for(int i = 0; i < m; i = i + 3){
            for (int j = 0; j < n; j = j + 3){
                for ( int k = 0; k < 9; k++){
                    if(board[i + k/3][j + k%3] != '.'){
                    if(set.contains(board[i + k/3][j + k%3]){
                        return false;
                    }else{
                        set.add(board[i + k/3][j + k%3]);
                    }
                 }
                 set.clear();
              }
            }
        }
        return true;
    }
}