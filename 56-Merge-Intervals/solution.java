/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
       if(intervals == null || intervals.size() <=1){
           return intervals;
       }
       Collections.sort(intervals, new IntervalComparator());
       List<Interval> result = new ArrayList<Interval>();
       Interval last = intervals.get(0);
       for(int i = 1; i< intervals.size(); i++){
           Interval cur = intervals.get(i);
           if(cur.start > last.end){
               result.add(last);
               last = cur;
           }else{
               last.end = Math.max(last.end, cur.end);
           }
       }
       result.add(last);
       return result;
    }
    private class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval a, Interval b){
          return a.start - b.start;
        }
    }
}