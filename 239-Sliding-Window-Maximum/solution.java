public class Solution {
    public void addElement(Deque<Integer> dq, int element){
        while(!dq.isEmpty() && dq.peekLast() < element){
            dq.pollLast();
        }
        dq.offerLast(element);
    }
    
    public void removeElement(Deque<Integer> dq, int element){
        if(!dq.isEmpty() && dq.peekFirst() == element){
            dq.pollFirst();
        }
    }
    public int[] maxSlidingWindow(int[] nums, int k) {
       if (nums == null || k <= 0) {
			return new int[0];
		}
		
       Deque<Integer> dq = new ArrayDeque<Integer>();
       int length = nums.length;
       int[] result = new int[length - k +1];
       for(int i =0; i <k-1; i++){
           addElement(dq, nums[i]);
       }
       for(int j = k-1; j < nums.length; j++){
           addElement(dq, nums[j]);
           result[j-k+1] = dq.peekFirst();
           removeElement(dq, nums[j-k+1]);
       }
     return result;  
    }
}