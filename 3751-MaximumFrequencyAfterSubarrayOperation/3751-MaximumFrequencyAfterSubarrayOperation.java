// Last updated: 7/21/2026, 11:50:58 AM
class Solution {
    public int maxFrequency(int[] nums, int k) {
        int c = 0;
        for (int num : nums) {
            if (num == k) c++;
        }

        int ans = c;
        for (int v = 1; v <= 50; v++) { //as per constraints
            if (v == k) continue; 
            int curr = 0;
            int max = 0;
            for (int num : nums) {
                if (num == v) curr += 1;
                else if (num == k) curr -= 1;
                curr = Math.max(curr, 0);
                max = Math.max(max, curr);
            }
            ans = Math.max(ans, c + max);
        }
        return ans;
    }
}
