// Last updated: 7/26/2026, 10:51:11 PM
class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        boolean flag=false;
        int c=0;
        int c2=1;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]) c++;
            if(nums[i]==nums[i-1]) c2++;
        }
        if(c2==n) return true;
        if((c==1 && nums[n-1]<=nums[0]) || (c==0 && nums[n-1]>nums[0])) return true;
        return false;
    }
}