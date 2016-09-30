public class Solution {
    class Cell {
        int x, y, h;
        Cell(int x, int y, int h){
            this.x = x;
            this.y = y;
            this.h = h;
        }
    }
    class CellComparator implements Comparator<Cell>{
        public int compare(Cell x, Cell y){
            if(x.h > y.h){
                return 1;
            }else if(x.h < y.h){
                return -1;
            }else {
                return 0;
            }
        }
    }
    public int trapRainWater(int[][] heightMap) {
        int m = heightMap.length;
        if(m == 0) return 0;
        int n = heightMap[0].length;
        if(n == 0) return 0;
        PriorityQueue<Cell> pq = new PriorityQueue<>(1, new CellComparator());
        int[][] visited = new int[m][n];
        for(int i = 0; i < m; i++){
            pq.offer(new Cell(i, 0, heightMap[i][0]));
            pq.offer(new Cell(i, n-1, heightMap[i][n-1]));
            visited[i][0] = 1;
            visited[i][n-1] = 1;
        }
        
        for(int j = 0; j < n; j++){
            pq.offer(new Cell(0, j, heightMap[0][j]));
            pq.offer(new Cell(m-1, j, heightMap[m-1][j]));
            visited[0][j] = 1;
            visited[m-1][j] = 1;
        }
        int result = 0;
        int[] dx = {1, -1, 0 ,0};
        int[] dy = {0, 0 ,1, -1};
        while(!pq.isEmpty()){
            Cell tmp = pq.poll();
            for(int i = 0; i < 4; i++){
               int nx = tmp.x + dx[i];
               int ny = tmp.y + dy[i];
               if( nx >= 0 && ny >= 0 && nx < m && ny <n && visited[nx][ny] == 0){
                   visited[nx][ny] = 1;
                   pq.offer(new Cell(nx, ny, Math.max(tmp.h, heightMap[nx][ny])));
                   result = result + Math.max(0, tmp.h- heightMap[nx][ny]);
               }
            }
        }
        return result;
    }
}