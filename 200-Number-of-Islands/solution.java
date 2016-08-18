public class Solution {
    public int convertToId(int x, int y, int n){
        return n*x + y;
    }
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        UF uf = new UF(m, n);
        int count = 0;
        for(int i =0 ; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '0'){
                    continue;
                }else{
                   if(i > 0 && grid[i-1][j] == '1'){
                       uf.union(convertToId(i, j, n), convertToId(i-1, j, n));
                   }else if(j > 0 && grid[i][j-1] == '1'){
                       uf.union(convertToId(i, j, n), convertToId(i, j-1, n));
                   }else{
                       count++;
                   }
                   
                }
            }
        }
        return count;
    }
    
    class UF{
        HashMap<Integer, Integer> father = new HashMap<Integer, Integer>();
        
        UF(int m, int n){
           for(int i = 0; i < m; i++){
               for(int j = 0; j < n; j++){
                   int id = convertToId(i, j ,n);
                   father.put(id, id); // 初始化。
               }
           } 
        }
        
        public int compressed_find(int x){
            int parent = x;
            while(parent != father.get(parent)){
                parent = father.get(parent);
            }
            int tmp = -1;
            int fa = x;
            while(fa != father.get(fa)){
                tmp = father.get(fa);
                father.put(fa, parent);
                fa = tmp;
            }
            return parent;
        }
        
        public void union(int x, int y){
            int pr_x = compressed_find(x);
            int pr_y = compressed_find(y);
            if(pr_x != pr_y){
                father.put(pr_x, pr_y);
            }
        }
    }
}