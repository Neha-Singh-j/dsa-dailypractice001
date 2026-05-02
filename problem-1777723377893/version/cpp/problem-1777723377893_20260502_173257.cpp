// Last updated: 5/2/2026, 5:32:57 PM
1#include <vector>
2#include <climits>
3using namespace std;
4
5class Solution {
6public:
7    int minSubArrayLen(int target, vector<int>& nums) {
8        int st = 0;
9        int end = 0;
10        int sum = 0;
11        int len = INT_MAX;
12
13        while (end < nums.size()) {
14            sum += nums[end];
15
16            while (sum >= target) {
17                if (end - st + 1 < len) {
18                    len = end - st + 1;
19                }
20                sum -= nums[st];
21                st++;
22            }
23
24            end++;
25        }
26
27        if (len != INT_MAX) {
28            return len;
29        } else {
30            return 0;
31        }
32    }
33};