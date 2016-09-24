public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        if(length%2 == 1){
           return findfortheKth(nums1, nums2, length/2+1, 0, 0); // 如果总共有3个，找第2大
        }else{
          return (findfortheKth(nums1, nums2, length/2, 0, 0)
                 +findfortheKth(nums1, nums2, length/2+1, 0, 0))/2.0; //如果总共有4个，找第2大，和第3大。

        }
    }
    
    
    public int findfortheKth(int[] nums1, int[] nums2, int k, int s1, int s2){ // 找第k大。
        if(s1 >= nums1.length){
            return nums2[s2+k-1];
        }
        if(s2 >= nums2.length) {
            return nums1[s1+k-1];
        }
        if(k == 1){
            return Math.min(nums1[s1], nums2[s2]);
        }
         
        int A_key = s1 + k/2 - 1 < nums1.length ? nums1[s1 + k/2 -1]: Integer.MAX_VALUE;
        int B_key = s2 + k/2 - 1 < nums2.length ? nums2[s2 + k/2 -1]: Integer.MAX_VALUE;
        if(A_key >= B_key){
           return findfortheKth(nums1, nums2, k-k/2, s1, s2+k/2);
        }else{
           return findfortheKth(nums1, nums2, k-k/2, s1+k/2, s2);
 
        }

    }
}