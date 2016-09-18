public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int i = 0;
        while(i < v1.length && i < v2.length){
            if(Integer.value(v1[i]) < Integer.value(v2[i])){
                return -1;
            }else if(Integer.value(v1[i]) > Integer.value(v2[i])){
                return 1
            }else{
                i++;
            }
        }
        
        while(i < v1.length){
            if(Integer.value(v1[i]) != 0){
                return 1;
            }
            i++;
        }
        
         while(i < v2.length){
            if(Integer.value(v2[i]) != 0){
                return 1;
            }
            i++;
        }
        return 0;
    }
}