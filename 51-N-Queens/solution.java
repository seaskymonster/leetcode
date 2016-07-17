public class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        if(n <= 0) return result;
        List<Integer> cols = new ArrayList<Integer>();
        search(result, cols, n);
        return result;
    }
    
    public void search(List<List<String>> result, List<Integer> cols, int n){
        if(cols.size() == n){
            result.add(drawGraph(cols));
            return;
        }
        for(int i = 0; i < n; i++){
            if(validQueen(cols, i)){
                cols.add(i);
                search(result, cols, n);
                cols.remove(cols.size()-1);
            }
        }
    }
    
    public boolean validQueen(List<Integer> cols, int col){
        int row = cols.size();
        for(int i = 0; i < row; i++){
            if(cols.get(i) == col){
                return false;
            }
            
            if( row - i == col - cols.get(i)){
                return false;
            }
            
            if(i - row == col - cols.get(i)){
                return false;
            }
        }
        return true;
    }
    
    public List<String> drawGraph(List<Integer> cols){
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < cols.size(); i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < cols.size(); j++){
                if(cols.get(i) == j){
                    sb.append("Q");
                }else{
                    sb.append(".");
                }
            }
            list.add(sb.toString());
        }
        return list;
    }
}