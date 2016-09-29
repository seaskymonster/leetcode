public class Solution {
  
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        // UF uf = new UF(m, n);
        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1'){
                    count++;
                    if(i > 0 && grid[i-1][j] == '1'){
                        count--;
                        continue;
                    }
                    if(j > 0 && grid[i][j-1] == '1'){
                        count--;
                    }
                }
            }
        }
        return count;
     
    }
    
    class UF {
        HashMap<Integer, Integer> father = new HashMap<>();
        
        UF(int m, int n){
            for(int i = 0; i < m; i++){
                for(int j =0; j < n; j++){
                    int value = i*n+j;
                    father.put(value, value);
                }
            }
        }
        
        int find(int x){
            int parent = x;
            while( parent != father.get(parent)){
                parent = father.get(parent);
            }
            
            int tmp  = -1;
            int fa = x;
            while( fa != father.get(fa)){
                tmp = father.get(fa);
                father.put(fa, parent);
                fa = tmp;
            }
            return parent;
        }
        
        void union (int x, int y){
            int fx = find(x);
            int fy = find(y);
            if(fx != fy){
                father.put(x, y);
            }
        }
    }
       
}