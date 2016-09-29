public class Solution {
    public boolean validTree(int n, int[][] edges) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        for(int i =0; i < n; i++){
            map.put(i, new HashSet<>());
        }
        for(int[] edge: edges){
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        
        boolean[] visited = new boolean[n];
        
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(0);
        
        while(!q.isEmpty()){
            int tmp = q.poll();
            if(visited[tmp]) return false;
            visited[tmp] = true;
            HashSet<Integer> neis = map.get(tmp);
            for(int ne: neis){
                q.offer(ne);
                map.get(ne).remove(tmp);
            }
        }
        
       for(boolean result : visited)
        {
            if(!result)
                return false;
        }
        
        return true;
    }
}