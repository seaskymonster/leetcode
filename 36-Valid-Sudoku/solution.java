public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        
        HashSet<Character> set = new HashSet<Character>();
        
        for(int i = 0; i < m; i++){
            set.clear();
            for(int j = 0; j < n; j++){
                if(board[i][j] != '.'){
                    if(set.contains(board[i][j])){
                        return false;
                    }else{
                        set.add(board[i][j]);
                    }
                }
            }
        }
        
        set.clear();
         for(int i = 0; i < n; i++){
            set.clear();
            for(int j = 0; j < m; j++){
                if(board[j][i] != '.'){
                    if(set.contains(board[j][i])){
                        return false;
                    }else{
                        set.add(board[j][i]);
                    }
                }
            }
        }
        
        for(int i = 0; i < m; i = i + 3){
            for (int j = 0; j < n; j = j + 3){
                 set.clear();

                for ( int k = 0; k < 9; k++){
                    if(board[i + k/3][j + k%3] != '.'){
                    if(set.contains(board[i + k/3][j + k%3])){ // 注意这个地方，怎么扫描一个九宫格。。
                        return false;
                    }else{
                        set.add(board[i + k/3][j + k%3]);
                    }
                 }
              }
            }
        }
        return true;
    }
}