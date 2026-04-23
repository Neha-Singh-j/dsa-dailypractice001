// Last updated: 4/23/2026, 8:52:24 PM
1class Solution {
2public:
3    void moveZeroes(vector<int>& nums) {
4        vector<int> arr;
5
6        // store non-zero elements
7        for (int i = 0; i < nums.size(); i++) {
8            if (nums[i] != 0) {
9                arr.push_back(nums[i]);
10            }
11        }
12
13        // fill entire array with 0
14        for (int i = 0; i < nums.size(); i++) {
15            nums[i] = 0;
16        }
17
18        // copy back non-zero elements
19        for (int i = 0; i < arr.size(); i++) {
20            nums[i] = arr[i];
21        }
22    }
23};