// Last updated: 5/2/2026, 5:33:17 PM
1#include <vector>
2#include <algorithm>
3using namespace std;
4
5class Solution {
6public:
7    vector<int> majorityElement(vector<int>& nums) {
8        vector<int> al;
9        int n = nums.size();
10
11        sort(nums.begin(), nums.end());
12
13        int threshold = n / 3;
14        int freq = 1;
15
16        for (int i = 1; i < n; i++) {
17            if (nums[i] == nums[i - 1]) {
18                freq++;
19            } else {
20                if (freq > threshold) {
21                    al.push_back(nums[i - 1]);
22                }
23                freq = 1;
24            }
25        }
26
27        if (freq > threshold) {
28            al.push_back(nums[n - 1]);
29        }
30
31        return al;
32    }
33};