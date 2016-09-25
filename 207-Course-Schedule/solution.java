public class Solution {
  
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       HashMap<Integer, ArrayList<Integer>> map = new HashMap<>(); // store every prev's later couse
       int[] indegree = new int[numCourses];
       for(int[] prereq: prerequisites){
           int course = prereq[0];
           int pre = prereq[1];
           indegree[course]++;
           if(map.containsKey(pre)){
               map.get(pre).add(course);
           }else{
               ArrayList<Integer> list = new ArrayList<>();
               list.add(course);
               map.put(pre, list);
           }
       }
       
       List<Integer> result = new ArrayList<Integer>();
       Queue<Integer> q = new LinkedList<>();
       for(int i = 0; i < indegree.length; i++){
           if(indegree[i] == 0){
               result.add(i);
               q.offer(i);
           }
       }
       
       while(!q.isEmpty()){
           int tmp = q.poll();
           if(map.containsKey(tmp)){
               for(int j: map.get(tmp)){
                   indegree[j]--;
                   if(indegree[j] == 0){
                       q.offer(j);
                       result.add(j);
                   }
               }
           }
       }
       return result.size() == numCourses;
    }
}