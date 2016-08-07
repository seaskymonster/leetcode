public class Solution {
    public List<List<Integer>> combinationSum2(int[] num, int target) {
        Arrays.sort(num); 
        return combinationSum(num,target,0);
    }
    public List<List<Integer>> combinationSum(int[] num, int target, int index){
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        if(target<=0) return result; //all the numbers are positive..
        int previouscheck=Integer.MIN_VALUE;
        for(int i=index;i<num.length;i++){
            if(previouscheck==num[i]) continue;
            previouscheck=num[i];
            if(num[i]>target) break;
            if(num[i]==target){
                List<Integer> cur=new ArrayList<Integer>();
                cur.add(num[i]);
                result.add(cur);
                return result;
            }
            List<List<Integer>> lastreturn=combinationSum(num,target-num[i],i+1);
            if(!lastreturn.isEmpty()){
                for(List<Integer> cur:lastreturn){
                    cur.add(0,num[i]);
                    result.add(cur);
                }
            }
        }
        return result;
    }
}