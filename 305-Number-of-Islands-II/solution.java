public class Solution {
    public List<Integer> numIslands2(int m, int n, int[][] positions) {
         int[][] grid = new int[m][n];
         int count = 0;
         List<Integer> result = new ArrayList<Integer>();
         UF uf = new UF(m,n);
         for(int[] p : positions){
             count++;
             int x = p[0];
             int y = p[1];
             grid[x][y] = 1;
             if(x > 0 && grid[x -1][y] == 1){ // check the upper element
                 if(uf.find(convertToId(x, y, n)) == uf.find(convertToId(x-1, y, n))){
                     continue;
                 }else{
                     count--;
                     uf.union(convertToId(x, y, n), convertToId(x-1, y, n));
                 }
             }
             
             if(x < m-1 && grid[x+1][y] == 1){ // check the bottom element
                   if(uf.find(convertToId(x, y, n)) == uf.find(convertToId(x+1, y, n))){
                     continue;
                 }else{
                     count--;
                     uf.union(convertToId(x, y, n), convertToId(x+1, y, n));
                 } 
             }
             
             if(y > 0 && grid[x][y -1] == 1) { // check the left element
                 if(uf.find(convertToId(x, y, n)) == uf.find(convertToId(x, y-1, n))){
                     continue;
                 }else{
                     count--;
                     uf.union(convertToId(x, y, n), convertToId(x, y-1, n));
                 }
             }
             
             if(y < n-1 && grid[x][y + 1] == 1) { // check the right element
                 if(uf.find(convertToId(x, y, n)) == uf.find(convertToId(x, y+1, n))){
                     continue;
                 }else{
                     count--;
                     uf.union(convertToId(x, y, n), convertToId(x, y+1, n));
              }
             
             result.add(count);
         }
         return result;
         
    }
    
    public int convertToId(int i, int j, int n){
        return i*n + j;
    }
    class UF{
        HashMap<Integer, Integer> father = new HashMap<Integer, Integer>();
        UF(int m, int n){
            for(int i =0 ;i < m; i++){
                for(int j = 0; j <n; j++){
                    int id = convertToId(i, j, n);
                    father.put(id, id);   
                }
            }
        }
        
        public int find(int x){
            int parent = x;
            while(parent != father.get(parent)){
                parent = father.get(parent);
            }
            int tmp = -1;
            int fa = x;
            while(fa != father.get(fa)){
                tmp = father.get(fa);
                father.put(tmp, parent);
                fa = tmp;
            }
            return parent;
        }
        
        public void union (int x, int y){
            int px = find(x);
            int py = find(y);
            if(px != py){
                father.put(px, py);
            }
        }
    }
}