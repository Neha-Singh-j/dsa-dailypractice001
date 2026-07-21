// Last updated: 7/21/2026, 11:51:04 AM
class Solution {
public:
    int subarraySum(vector<int>& nums) {
        int start = 0;
        int Sum = 0;

        for (int i = 0; i < nums.size(); i++) {
            start = max(0, i - nums[i]);

            for (int j = start; j <= i; j++) {
                Sum += nums[j];
            }
        }

        return Sum;
    }
};