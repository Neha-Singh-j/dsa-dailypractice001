// Last updated: 4/28/2026, 11:11:26 PM
1#include <vector>
2#include <algorithm>
3using namespace std;
4
5class Solution {
6public:
7    long long perfectPairs(vector<int>& nums) {
8
9        int n = nums.size();
10        long long ans = 0;
11
12        vector<int> arr(n);
13
14        // take absolute values
15        for (int i = 0; i < n; i++) {
16            arr[i] = abs(nums[i]);
17        }
18
19        sort(arr.begin(), arr.end());
20
21        int j = 0;
22
23        for (int i = 0; i < n; i++) {
24
25            // move j until condition satisfied
26            while (arr[i] > 2LL * arr[j]) {
27                j++;
28            }
29
30            ans += (i - j);
31        }
32
33        return ans;
34    }
35};