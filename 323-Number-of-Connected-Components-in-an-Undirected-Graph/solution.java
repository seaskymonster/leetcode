public class Solution {
    public int countComponents(int n, int[][] edges) {
        int count = n;
        UF uf = new UF(n);
        for(int[] e: edges){
            int x = e[0];
            int y = e[1];
            if(uf.find(x) != uf.find(y)){
                count--;
                uf.union(x, y);
            }
        }
        return count;
    }
    
    class UF {
        HashMap<Integer, Integer> father = new HashMap<Integer, Integer>();
        public UF(int n){
            for(int i=0; i < n; i++){
                father.put(i, i);
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
                father.put(fa, parent);
                fa = tmp;
            }
            return parent;
        }
        
        public void union(int x, int y){
            int px = find(x);
            int py = find(y);
            if(px != py){
                father.put(px, py);
            }
        }
    }
}