// Last updated: 7/26/2026, 10:58:28 PM
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i : nums) sum += i;
        if (sum % 2 != 0) return false;
        
        int target = sum / 2;
        Boolean[][] dp = new Boolean[nums.length][target + 1];
        return rec(nums, 0, 0, target, dp);
    }
    private boolean rec(int[] nums, int i, int curr, int target, Boolean[][] dp) {
        if (curr == target) return true;

        if (i >= nums.length || curr > target) return false;

        if (dp[i][curr] != null) return dp[i][curr];
        boolean add = rec(nums, i + 1, curr + nums[i], target, dp);
        boolean not_Add = rec(nums, i + 1, curr, target, dp);

        dp[i][curr] = add || not_Add;
        return dp[i][curr];
    }
}
