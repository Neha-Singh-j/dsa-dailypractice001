// Last updated: 7/26/2026, 10:57:50 PM
class Solution {
    int ans=0;
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums,target,0,0);
    }
    public int solve(int[] nums, int target, int i, int curr){
        if(i>=nums.length && curr==target){
           return 1;
        }
        if(i>=nums.length) return 0;
        int a=solve(nums,target,i+1,curr+nums[i]);
        int b=solve(nums,target, i+1,curr-nums[i]);
        return a+b;
        
    }
}