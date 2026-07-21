// Last updated: 7/21/2026, 11:50:28 AM
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<bool> prime;

    int primeSubarray(vector<int>& nums, int k) {
        int n = nums.size(), mx = 0;

        // maximum value in nums for sieve limit
        for (int num : nums) mx = max(mx, num);

        map<int, int> mp; // same as TreeMap (sorted)
        int primes = 0;

        int l1 = 0, l2 = 0;

        sieve(mx);

        int cntK = 0, cnt1 = 0;

        for (int r = 0; r < n; r++) {
            if (prime[nums[r]]) {
                primes++;
                mp[nums[r]]++;
            }

            while (primes > 1) {
                if (prime[nums[l1]]) primes--;
                l1++;
            }

            // Maintain window [l2..r] with (maxPrime - minPrime) <= k
            while (!mp.empty() && (mp.rbegin()->first - mp.begin()->first > k)) {
                if (prime[nums[l2]]) {
                    mp[nums[l2]]--;
                    if (mp[nums[l2]] == 0) mp.erase(nums[l2]);
                }
                l2++;
            }

            cnt1 += (r - l1 + 1);
            cntK += (r - l2 + 1);
        }

        return cntK - cnt1;
    }

    void sieve(int n) {
        prime.assign(n + 1, true);
        if (n >= 0) prime[0] = false;
        if (n >= 1) prime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
    }
};