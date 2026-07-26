// Last updated: 7/26/2026, 10:48:25 PM
class Solution {
public:
    vector<int> applyOperations(vector<int>& nums) {
        int n = nums.size();

        // Step 1: Apply operations
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        int c = 0;
        vector<int> arr(n);
        int j = 0;

        // Step 2: Move non-zero elements
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                c++;
            } else {
                arr[j] = nums[i];
                j++;
            }
        }

        // Step 3: Fill remaining with zeros
        while (c > 0) {
            arr[j] = 0;
            j++;
            c--;
        }

        return arr;
    }
};