public class Solution {
    public String largestNumber(int[] nums) {
        String sa = new String[nums.length];
        for(int i =0; i < nums.lenght; i++){
            sa[i] = Integer.toString(nums[i]);
        }
        
        Arrays.sort(sa, new NumberComparator());
        StringBuilder sb = new StringBuilder();
        for(String item : sa){
            sb.append(item);
        }
        
        String result = sb.toString();
        int index = 0;
        while(index < result.length() && result.charAt(index) == '0'){
            index++;
        }
        if(index == result.length()) return "0";
        else return result.substring(index, result.length());
    }
}

class NumberComparator implements Comparator<String>{
    public int compare(String a, String b){
        return (b+a).CompareTo(a+b);
    }
}