// Last updated: 7/26/2026, 10:56:17 PM
#include <vector>
using namespace std;

class Solution {
public:
    int numSubarrayProductLessThanK(vector<int>& nums, int k) {
        int c = 0;
        int curr = 1;
        int j = 0;
        int i = 0;

        while (i < nums.size()) {
            curr *= nums[i];

            while (curr >= k && j <= i) {
                curr /= nums[j];
                j++;
            }

            c += (i - j + 1);
            i++;
        }

        return c;
    }
};