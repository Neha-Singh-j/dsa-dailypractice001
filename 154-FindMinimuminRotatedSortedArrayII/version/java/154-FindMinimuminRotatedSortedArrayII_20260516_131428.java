// Last updated: 5/16/2026, 1:14:28 PM
1class Solution {
2    public int findMin(int[] nums) {
3        int mini = Integer.MAX_VALUE;
4        int lo = 0;
5        int hi = nums.length - 1;
6        while (lo <= hi) {
7            int mid = lo + (hi - lo) / 2;
8            if (nums[lo] == nums[mid] && nums[mid] == nums[hi]) {
9                mini = Math.min(mini, nums[mid]);
10                lo++;
11                hi--;
12            } else if (nums[lo] <= nums[mid]) {
13                mini = Math.min(mini, nums[lo]);
14                lo = mid + 1;
15            } else {
16                mini = Math.min(mini, nums[mid]);
17                hi = mid - 1;
18            }
19        }
20        return mini;
21    }
22}