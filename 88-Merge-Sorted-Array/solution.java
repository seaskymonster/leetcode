public class Solution {
    // public void merge(int[] nums1, int m, int[] nums2, int n) {
    //     int[] temp = new int[m+n];
    //     int left = 0;
    //     int right = 0;
    //     int index = 0;
    //     while(left<m && right<n){
    //         if(nums1[left]<nums2[right]){
    //             temp[index++]= nums1[left++];
    //         }else{
    //             temp[index++] = nums2[right++];
    //         }
    //     }
    //     while(left<m){
    //         temp[index++] = nums1[left++];
    //     }
    //     while(right<n){
    //         temp[index++] = nums2[right++];
    //     }
    //     for(int i=0;i<m+n;i++){
    //         nums1[i] = temp[i];
    //     }
    // }
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int p1 = m-1;
       int p2 = n-1;
       int p = m+n-1; // 这点注意
       
       while(p1 >= 0 && p2 >= 0){
           if(nums1[p1] > nums2[p2]){
               nums1[p--] = nums1[p1--];
           }else{
               nums1[p--] = nums2[p2--];
           }
       }
       while(p1 >= 0){
           nums1[p--] = nums1[p1--];
       }
       
       while(p2 >= 0){
           nums1[p--] = nums2[p2--];
       }
    }
}