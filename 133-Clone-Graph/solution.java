/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null) return null;
        Queue<UndirectedGraphNode> q = new LinkedList<>();
        HashMap<UndirectedGraphNode,UndirectedGraphNode> map = new HashMap<>();
        UndirectedGraphNode copynode = new UndirectedGraphNode(node.label);
        map.put(node, copynode);
        q.offer(node);
        
        while(!q.isEmpty()){
            UndirectedGraphNode cur = q.poll();
            if(!map.containsKey(cur)){
                for(UndirectedGraphNode nb : cur.neighbors){
                     UndirectedGraphNode copynb = new UndirectedGraphNode(nb.label);
                     map.put(nb, copynb);
                     q.offer(nb);
                }
            }
        }
        
        q.offer(node);
        HashSet<UndirectedGraphNode> set = new HashSet<UndirectedGraphNode>();
        set.put(node);
         while(!q.isEmpty()){
            UndirectedGraphNode cur = q.poll();
            UndirectedGraphNode copycur = map.get(cur);
            if(!set.contains(cur)){
            copycur.neighbors = new ArrayList<UndirectedGraphNode>();
            for(UndirectedGraphNode nb : cur.neighbors){
                copycur.neighbors.add(map.get(nb));
                q.offer(nb);
                set.add(nb);
             }
            }
        }
        
        return map.get(node);
        
    }
}