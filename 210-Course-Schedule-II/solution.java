public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
     HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int[] indegree = new int[numCourses];
        for(int[] pre : prerequisites){
            int ready = pre[0]; // the current node
            int prev = pre[1]; // the previous node
            indegree[ready]++;
            if(map.containsKey(prev)){
                map.get(prev).add(ready);
            }else{
                ArrayList<Integer> readylist = new ArrayList<>();
                readylist.add(ready);
                map.put(prev, readylist);
            }
        }
        
        
        
        
        Queue<Integer> q = new LinkedList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i =0; i < numCourses; i++){
            if(indegree[i] == 0){
                q.offer(i);
                result.add(i);
            }
        }

        while(!q.isEmpty()){
            int tmp = q.poll();

            if(map.containsKey(tmp)){
                for(int j: map.get(tmp)){ // map.get(tmp) 返回的是 所有的 下一个节点
                    indegree[j]--;
                    if(indegree[j] == 0){
                         q.offer(j);
                         result.add(j);
                     }
                }
            }
        }
        if(result.size() == numCourses){
              int[] resultarray = new int[numCourses];
              int f = 0;
              for(int k: result){
                  resultarray[f] = k;
                  f++;
                }
            return resultarray;
        }else{
            return new int[0];
        }
        
    }
}