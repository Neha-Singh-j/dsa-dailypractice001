// Last updated: 5/2/2026, 5:29:31 PM
1class Solution {
2public:
3    int longestOnes(vector<int>& nums, int k) {
4        int st = 0;
5        int end = 0;
6        int c = 0;
7        int maxLen = INT_MIN;
8
9        while (end < nums.size()) {
10            if (nums[end] == 0) {
11                c++;
12            }
13
14            while (c > k) {
15                if (nums[st] == 0) {
16                    c--;
17                }
18                st++;
19            }
20
21            maxLen = max(maxLen, end - st + 1);
22            end++;
23        }
24
25        return maxLen;
26    }
27};