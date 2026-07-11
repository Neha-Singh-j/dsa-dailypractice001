// Last updated: 7/12/2026, 12:16:13 AM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long ans=0;
        Arrays.sort(nums);
        int i=nums.length-1;
        int t = Math.min(k, Math.max(0, mul - 1));
        while(t>0 && i>=0){
            ans+= 1L* nums[i]*mul;
            t--;
            k--;
            mul--;
            i--;
        }
        while(k-->0){
            ans+=nums[i];
            i--;
        }
        return ans;
    }
}