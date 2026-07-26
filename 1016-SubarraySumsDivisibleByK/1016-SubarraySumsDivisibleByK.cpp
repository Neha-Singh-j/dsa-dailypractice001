// Last updated: 7/26/2026, 10:54:44 PM
#include <vector>
using namespace std;

class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        return Count_subArray(nums, k);
    }

    int Count_subArray(vector<int>& arr, int k) {
        int n = arr.size();

        vector<long long> freq(k, 0);
        long long sum = 0;

        freq[0] = 1;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            int rem = sum % k;

            if (rem < 0) {
                rem += k; // handle negative remainder
            }

            freq[rem]++;
        }

        long long ans = 0;

        for (int i = 0; i < k; i++) {
            if (freq[i] >= 2) {
                long long x = freq[i];
                ans += (x * (x - 1)) / 2;
            }
        }

        return (int)ans;
    }
};