public class Solution {
    public boolean validTree(int n, int[][] edges) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i =0; i < n; i++){
            map.put(i, new ArrayList<>());
        }
        for(int[] edge: edges){
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        
        int[] visited = new int[n];
        
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(0);
        
        while(!q.isEmpty()){
            int tmp = q.poll();
            if(visited[tmp]) return false;
            visited[tmp] = true;
            List<Integer> neis = map.get(tmp);
            for(int ne: neis){
                q.offer(ne);
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