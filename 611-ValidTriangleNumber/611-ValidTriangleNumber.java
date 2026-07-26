// Last updated: 7/26/2026, 10:56:53 PM
class Solution {
    public int triangleNumber(int[] nums) {
       Arrays.sort(nums);
        int n = nums.length;
        int c = 0;

        for (int k = n - 1; k >= 2; k--) {
            int i = 0, j = k - 1;
            while (i < j) {
                if (nums[i] + nums[j] > nums[k]) {
                    c += (j - i);   // all pairs valid
                    j--;
                } else {
                    i++;
                }
            }
        }
        return c;
    }
}