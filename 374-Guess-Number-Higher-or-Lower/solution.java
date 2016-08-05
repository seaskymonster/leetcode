/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
       return helper(1, n);
    }
    
    public int helper(int start, int end){
        if(start > end) return -1;
        int mid = start + (end - start)/2;
        if(guess(mid) == -1) {
            return helper(start, mid -1);
        }
        
        if(guess(mid) == 1){
            return helper(mid + 1, end);
        }
        
        if(guess(mid) == 0){
            return mid;
        }
        return -1;
        
    }
}