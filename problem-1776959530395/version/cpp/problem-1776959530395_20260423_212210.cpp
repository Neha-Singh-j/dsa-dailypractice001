// Last updated: 4/23/2026, 9:22:10 PM
1class Solution {
2public:
3    int search(vector<int>& nums, int target) {
4        sort(nums.begin(), nums.end());
5
6        int n = nums.size();
7        int lo = 0;
8        int hi = n - 1;
9
10        while (lo <= hi) {
11            int mid = lo + (hi - lo) / 2;
12
13            if (nums[mid] > target) {
14                hi = mid - 1;
15            } else if (nums[mid] < target) {
16                lo = mid + 1;
17            } else {
18                return mid;
19            }
20        }
21        return -1;
22    }
23};