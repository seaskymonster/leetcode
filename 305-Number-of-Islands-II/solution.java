public class Solution {
    public List<Integer> numIslands2(int m, int n, int[][] positions) {
         int[][] grid = new int[m][n];
         int count = 0;
         List<Integer> result = new ArrayList<Integer>();
         UF uf = new UF(m,n);
         for(int[] p, positions){
             count++;
             if(p[0] > 0 && grid[p[0] -1][p[1]] == 1){
                 if(uf.find(convertToId(p[0], p[1], n)) == uf.find(convertToId(p[0]-1, p[1], n))){
                     continue;
                 }else{
                     count--;
                     uf.union(convertToId(p[0], p[1], n), convertToId(p[0]-1, p[1], n));
                 }
             }
             if(p[1] > 0 && grid[p[0]][p[1] -1] == 1) {
                 if(uf.find(convertToId(p[0], p[1], n)) == uf.find(convertToId(p[0], p[1]-1, n))){
                     continue;
                 }else{
                     count--;
                     uf.union(convertToId(p[0], p[1], n), convertToId(p[0], p[1]-1, n));
                 }
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
            while(parent != father(parent)){
                parent = father(parent);
            }
            int tmp = -1;
            int fa = x;
            while(fa != father(fa)){
                tmp = father(fa);
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