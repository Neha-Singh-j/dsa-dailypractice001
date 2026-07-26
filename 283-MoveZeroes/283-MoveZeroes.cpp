// Last updated: 7/26/2026, 11:00:34 PM
class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        vector<int> arr;

        // store non-zero elements
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] != 0) {
                arr.push_back(nums[i]);
            }
        }

        // fill entire array with 0
        for (int i = 0; i < nums.size(); i++) {
            nums[i] = 0;
        }

        // copy back non-zero elements
        for (int i = 0; i < arr.size(); i++) {
            nums[i] = arr[i];
        }
    }
};