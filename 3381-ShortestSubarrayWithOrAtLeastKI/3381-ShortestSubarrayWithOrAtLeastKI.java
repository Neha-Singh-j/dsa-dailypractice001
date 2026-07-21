// Last updated: 7/21/2026, 11:51:38 AM
class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int curr = nums[i];
            if (curr >= k) {
                return 1;
            }
            for (int j = i + 1; j < n; j++) {
                curr |= nums[j];
                if (curr >= k) {
                    ans = Math.min(ans, j - i + 1);
                    break;
                }
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
