// Last updated: 7/26/2026, 10:51:47 PM
#include <vector>
#include <unordered_set>
#include <algorithm>
using namespace std;

class Solution {
public:
    int maximumUniqueSubarray(vector<int>& nums) {
        unordered_set<int> st;
        int maxSum = 0, currentSum = 0;
        int start = 0;

        for (int end = 0; end < nums.size(); end++) {
            while (st.count(nums[end])) {
                st.erase(nums[start]);
                currentSum -= nums[start];
                start++;
            }
            st.insert(nums[end]);
            currentSum += nums[end];
            maxSum = max(maxSum, currentSum);
        }

        return maxSum;
    }
};