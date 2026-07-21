// Last updated: 7/21/2026, 11:52:39 AM
class Solution {
public:
    int maximizeGreatness(vector<int>& nums) {
        
        sort(nums.begin(), nums.end());

        int n = nums.size();
        int i = 0, j = 0, count = 0;

        while (j < n) {
            if (nums[j] > nums[i]) {
                count++;
                i++;
            }
            j++;
        }

        return count;
    }
};