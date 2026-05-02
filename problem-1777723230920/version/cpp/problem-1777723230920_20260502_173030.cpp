// Last updated: 5/2/2026, 5:30:30 PM
1#include <vector>
2#include <unordered_set>
3#include <algorithm>
4using namespace std;
5
6class Solution {
7public:
8    int maximumUniqueSubarray(vector<int>& nums) {
9        unordered_set<int> st;
10        int maxSum = 0, currentSum = 0;
11        int start = 0;
12
13        for (int end = 0; end < nums.size(); end++) {
14            while (st.count(nums[end])) {
15                st.erase(nums[start]);
16                currentSum -= nums[start];
17                start++;
18            }
19            st.insert(nums[end]);
20            currentSum += nums[end];
21            maxSum = max(maxSum, currentSum);
22        }
23
24        return maxSum;
25    }
26};