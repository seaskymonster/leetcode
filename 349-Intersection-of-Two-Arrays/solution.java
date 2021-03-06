public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0 ){
            return new int[0];
        }
        
        HashSet<Integer> set = new HashSet<Integer>();
        HashSet<Integer> result = new HashSet<Integer>();
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        
        for(int j = 0; j < nums2.length; j++){
            if(set.contains(nums2[j]) && !result.contains(nums2[j])){ // set 里面加入重复的也没事
                result.add(nums2[j]);
            }
        }
        int[] intersection = new int[result.size()];
        int index = 0;
        for(Integer val : result){
            intersection[index] = val;
            index++;
        }
        return intersection;
    }
}