// Last updated: 7/26/2026, 10:52:16 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        
        left[0]=nums[0];
        for(int i=1;i<n;i++){
            left[i]=nums[i]+left[i-1];
        }
        
        return left;
    }
}