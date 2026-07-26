// Last updated: 7/26/2026, 10:48:38 PM
#include <vector>
using namespace std;

class Solution {
public:
    int mostFrequentEven(vector<int>& nums) {
        vector<int> freq(100001, 0);

        // count only even numbers
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] % 2 == 0) {
                freq[nums[i]]++;
            }
        }

        int maxFreq = 0;
        int ans = -1;

        for (int i = 0; i <= 100000; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = i;
            }
        }

        return ans;
    }
};