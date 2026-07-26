// Last updated: 7/26/2026, 10:54:29 PM
class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int st = 0;
        int end = 0;
        int c = 0;
        int maxLen = INT_MIN;

        while (end < nums.size()) {
            if (nums[end] == 0) {
                c++;
            }

            while (c > k) {
                if (nums[st] == 0) {
                    c--;
                }
                st++;
            }

            maxLen = max(maxLen, end - st + 1);
            end++;
        }

        return maxLen;
    }
};