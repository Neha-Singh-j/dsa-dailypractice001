// Last updated: 7/26/2026, 10:57:37 PM
#include <vector>
#include <unordered_map>
using namespace std;

class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        unordered_map<int, int> mp;

        int len = 0;
        int sum = 0;

        mp[0] = -1;  // same as map.put(0, -1)

        for (int i = 0; i < nums.size(); i++) {

            if (nums[i] == 0) {
                sum += -1;
            } else {
                sum += 1;
            }

            if (mp.find(sum) != mp.end()) {
                len = max(len, i - mp[sum]);
            } else {
                mp[sum] = i;
            }
        }

        return len;
    }
};