// Last updated: 7/21/2026, 11:52:16 AM
class Solution {
    public boolean doesValidArrayExist(int[] arr) {
        int ans=0;
        for(int a:arr){
            ans^=a;
        }
        return ans==0;
        
    }
}