// Last updated: 7/21/2026, 11:52:26 AM
class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int[] freq = new int[101]; // index = value + 50

         for (int i = 0; i < k; i++) {
            freq[nums[i] + 50]++;
        }
        ans[0] = getXthNegative(freq, x);

        // slide window
        for (int i = k; i < n; i++) {
            freq[nums[i] + 50]++;           // add right
            freq[nums[i - k] + 50]--;       // remove left
            ans[i - k + 1] = getXthNegative(freq, x);
        }

        return ans;
    }

    private int getXthNegative(int[] freq, int x) {
        int count = 0;
        for (int v = -50; v < 0; v++) {
            count += freq[v + 50];
            if (count >= x) return v;
        }
        return 0;
    }
}
