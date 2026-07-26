// Last updated: 7/26/2026, 10:55:05 PM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int maxSum=nums[0];
        int minSum=nums[0];
        int currMin=0,currMax=0;
        int sum=0;
        for(int i=0;i<n;i++){
            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(minSum, currMin);

            sum+=nums[i];
        }
        if(maxSum<0){ // when all numbers are negative
            return maxSum;
        }
        return Math.max(sum-minSum,maxSum);

    }
}