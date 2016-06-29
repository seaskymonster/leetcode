public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(n);
        
        while(n != 1){
            int newn = 0;
            while(n >= 1){
                newn += (n%10) * (n%10);
                n = n/10;
            }
            n = newn;
            if(set.contains(n)) {
                return false;
            }else{
                set.add(n);
            }
        }
        
        return true;
    }
}