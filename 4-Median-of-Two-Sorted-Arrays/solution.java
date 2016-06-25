public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        if(length%2 == 1){
           return findfortheKth(nums1, nums2, length/2+1, 0, nums1.length-1, 0, nums2.length-1);
        }else{
          return (findfortheKth(nums1, nums2, length/2, 0, nums1.length-1, 0, nums2.length-1)
                 +findfortheKth(nums1, nums2, length/2+1, 0, nums1.length-1, 0, nums2.length-1))/2;

        }
    }
    
    
    public int findfortheKth(int[] nums1, int[] nums2, int k, int s1, int e1, int s2, int e2){
        if(s1 > e1){
            return nums2[s1+k-1];
        }
        if(s2 > e2) {
            return nums1[s2+k-1];
        }
        if(k == 1){
            return Math.min(nums1[s1], nums2[s2]);
        }
         
        int A_key = s1 + 2/k - 1 > e1 ? nums1[s1 + 2/k -1]: Integer.MAX_VALUE;
        int B_key = s2 + 2/k - 1 > e2 ? nums2[s2 + 2/k -1]: Integer.MAX_VALUE;
        if(A_key > B_key){
           return findfortheKth(nums1, nums2, k-k/2, s1, e1, s2+k/2, e2);
        }else{
           return findfortheKth(nums1, nums2, k-k/2, s1+k/2, e1, s2, e2);
 
        }
    }
}