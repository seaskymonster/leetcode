public class Solution {
    class Node {
        int x;
        int y;
        int val;
        Node(int x, int y, int val){
            this.x = x;
            this.y = y;
            this.val = val;
        }
    }
    class NumComparator implements Comparator<Node>{
        public int compare(Node a, Node b){
            if(a.val < b.val){
                return -1;
            }else if (a.val > b.val){
                return 1;
            }else{
                return 0;
            }
        }
    }
    public int kthSmallest(int[][] matrix, int k) {
        // write your code here
        int m = matrix.length;
        int n = matrix[0].length;
        if(k > m*n) return -1;
        PriorityQueue<Node> pq = new PriorityQueue<Node>(k, new NumComparator());
        int i = 0;
        int j = 0;
        boolean [][] visited = new boolean[m][n];
        visited[0][0] = true;
        
        pq.offer(new Node(0, 0, matrix[0][0]));
        
        for(int l = 0; l < k-1; l++){
            Node tmp = pq.poll();
             
            if(tmp.x + 1 < m && !visited[tmp.x+1][tmp.y] ){
                visited[tmp.x+1][tmp.y] = true;
                pq.offer(new Node(tmp.x+1, tmp.y, matrix[tmp.x+1][tmp.y]));
            }
            if(tmp.y + 1 < n && !visited[tmp.x][tmp.y+1]){
                visited[tmp.x][tmp.y+1] = true;
                pq.offer(new Node(tmp.x, tmp.y+1, matrix[tmp.x][tmp.y+1]));
            }
        }
        
        Node result = pq.poll();
        return result.val;
        
    }
    
}