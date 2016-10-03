public class Solution {
    public boolean exist(char[][] board, String word) {
        if(board == null) return false;
        int m = board.length;
        if(m == 0) return false;
        int n = board[0].length;
        if(n == 0) return false;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(dfs(i, j, board, 0, word)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean dfs(int i, int j, char[][] board, int index, String word){
        if(index == word.length()) return true;
        int m = board.length;
        int n = board[0].length;
        if(i < 0 || j < 0 || i >= m || j >=n || board[i][j] == '*') return false;
        if(word.charAt(index) != board[i][j]) return false;
        char tmp = board[i][j];
        board[i][j] = '*';
        boolean result = dfs(i-1, j, board, index+1, word) ||
                         dfs(i, j-1, board, index+1, word) ||
                         dfs(i, j+1, board, index+1, word) ||
                         dfs(i+1, j, board, index+1, word);
        board[i][j] = tmp;
        return result;
    }
}