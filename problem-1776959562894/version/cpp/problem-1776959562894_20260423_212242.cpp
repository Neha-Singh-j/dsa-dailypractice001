// Last updated: 4/23/2026, 9:22:42 PM
1class Solution {
2public:
3    int findMaxConsecutiveOnes(vector<int>& nums) {
4        int count = 0;
5        int maxi = 0;
6
7        for (int i = 0; i < nums.size(); i++) {
8            if (nums[i] == 1) {
9                count++;
10            } else {
11                maxi = max(count, maxi);
12                count = 0;
13            }
14        }
15
16        // check last sequence
17        maxi = max(count, maxi);
18
19        return maxi;
20    }
21};