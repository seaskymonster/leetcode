public class Solution {
    public int mySqrt(int x) {
        int start = x / 2;
        while(start * start != x){
            if(start * start > x){
                start = start - 1;
            }else{
                start = start + 1;
            }
        }
        return start;
    }
}