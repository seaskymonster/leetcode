public class Solution {
    public int convertToId(int x, int y, int n){
        return n*x + y;
    }
  
    public int numIslands(char[][] grid) {
        int m = grid.length;
        if(m == 0) return 0;
        int n = grid[0].length;
        if(n == 0) return 0;
        UF uf = new UF(m, n);
        int count = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1'){
                    count++;
                    if(i > 0 && grid[i-1][j] == '1'){
                      if(uf.find (convertToId(i, j, n)) == uf.compressed_find(convertToId(i-1, j, n))){
                           continue;
                       }else{
                          count--;
                          uf.union(convertToId(i, j, n), convertToId(i-1, j, n));
                       }
                    }
                    if(j > 0 && grid[i][j-1] == '1'){
                        if(uf.find (convertToId(i, j, n)) == uf.find(convertToId(i, j-1, n))){
                           continue;
                       }else{
                           count--;
                           uf.union(convertToId(i, j, n), convertToId(i, j-1, n));
                       }
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