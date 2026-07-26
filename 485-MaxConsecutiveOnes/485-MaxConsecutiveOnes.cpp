// Last updated: 7/26/2026, 10:57:59 PM
class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int count = 0;
        int maxi = 0;

        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxi = max(count, maxi);
                count = 0;
            }
        }

        // check last sequence
        maxi = max(count, maxi);

        return maxi;
    }
};