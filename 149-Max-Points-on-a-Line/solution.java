/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */
 
 //思想：任意选取一个固定点，然后把所有其他的点loop一遍，统计相同斜率或者是相同位置点的个数。 选取一个大的。
 // 最后比较所有的个数，选取最大的。
public class Solution {
    public int maxPoints(Point[] points) {
        if(points == null || points.length < 1){
            return 0;
        }
        int max = 1;
        HashMap<Double, Integer> map = new HashMap<Double, Integer>();
        int dup = 0;// 需要统计跟选定点重复的点的个数。
        for(int i = 0; i < points.length; i++){
            map.clear(); // 每次选取一个点都要clear 一下。
            dup = 0; // clear dup
            for(int j = i+1; j < points.length; j++){
                if(points[j].x == points[i].x && points[j].y == points[i].y){
                    dup ++;
                }else{
                   double k = (points[j].x == points[i].x) ? Integer.MAX_VALUE : 0.0 + (double)(points[j].y - points[i].y)/
                   (double)(points[j].x -points[i].x);
                   if(map.containsKey(k)){
                       map.put(k, map.get(k) + 1);
                   }else{
                       map.put(k, 2); // 至少有两个点在那个斜率上。
                   }
                }
            }
            if(map.size() == 0){
                max = Math.max(max, dup+1);
            }else{
               for(Double k_value: map.keySet()){
                   max = Math.max(max, map.get(k_value)+ dup);
               }
            }
        }
        return max;
    }
}