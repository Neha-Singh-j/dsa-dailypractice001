// Last updated: 5/2/2026, 5:34:12 PM
1#include <vector>
2using namespace std;
3
4class Solution {
5public:
6    int numberOfArithmeticSlices(vector<int>& nums) {
7        int n = nums.size();
8        if (n < 3) {
9            return 0;
10        }
11
12        int count = 1;
13        int ans = 0;
14
15        for (int i = 2; i < n; i++) {
16            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
17                ans += count++;
18            } else {
19                count = 1;
20            }
21        }
22
23        return ans;
24    }
25};