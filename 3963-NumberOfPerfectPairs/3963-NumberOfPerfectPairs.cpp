// Last updated: 7/21/2026, 11:50:09 AM
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    long long perfectPairs(vector<int>& nums) {

        int n = nums.size();
        long long ans = 0;

        vector<int> arr(n);

        // take absolute values
        for (int i = 0; i < n; i++) {
            arr[i] = abs(nums[i]);
        }

        sort(arr.begin(), arr.end());

        int j = 0;

        for (int i = 0; i < n; i++) {

            // move j until condition satisfied
            while (arr[i] > 2LL * arr[j]) {
                j++;
            }

            ans += (i - j);
        }

        return ans;
    }
};