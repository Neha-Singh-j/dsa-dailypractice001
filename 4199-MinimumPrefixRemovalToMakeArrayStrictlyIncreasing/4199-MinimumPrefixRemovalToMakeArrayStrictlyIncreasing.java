// Last updated: 7/12/2026, 12:16:29 AM
class Solution {
    public int minimumPrefixLength(int[] nums) {
        int c=0;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]) continue;
            else c=i; break;
        }
        return c;
    }
}