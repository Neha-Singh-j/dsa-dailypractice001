// Last updated: 7/21/2026, 11:51:11 AM
class Solution {
public:
    int countPartitions(vector<int>& nums) {

        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            sum += nums[i];
        }

        int count = 0;
        int s2 = 0;

        for (int i = 0; i < nums.size() - 1; i++) {

            s2 += nums[i];
            int curr = sum - s2;

            if (abs(curr - s2) % 2 == 0) {
                count++;
            }
        }

        return count;
    }
};