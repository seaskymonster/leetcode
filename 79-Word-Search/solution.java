public class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        int index = 0;
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == word.charAt(index)){
                    boolean rst= helper(i, j, board, word, 0);
                    if(rst) return true;
                }
            }
        }
        return false;
    }
    
    public boolean helper(int i, int j, char[][] board, String word, int index){
        int m = board.length;
        int n = board[0].length;
        if(index == word.length()) return true;
        if(i < 0 || i >= m || j < 0 || j >= n ) return false;
        if(board[i][j] != word.charAt(i)) return false;
        
          board[i][j] = '#'; // should remember to mark it
        
        boolean rst= helper(i-1, j, board, word, index+1) || helper(i+1, j, board, word, index+1) || helper(i, j-1, board, word, index+1) || helper(i, j+1, board, word, index+1);
        board[i][j] = word.charAt(index); // 你上个dfs 弄完了，那你要恢复。
        
        return rst;

    }
}