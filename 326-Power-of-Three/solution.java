public class Solution {
    public boolean isPowerOfThree(int n) {
      if(n < 1) return false;
       
      while(n % 3 == 0){
          n = n/3;
      } // go until n is 1. every step you should make sure n%3, becuase 4/3 =1.  也就是确认没有约等于的情况发生。
       
      return n == 1;
      
    }
}