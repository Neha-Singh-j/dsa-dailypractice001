// Last updated: 4/30/2026, 6:27:58 PM
1#include <bits/stdc++.h>
2using namespace std;
3
4class Solution {
5public:
6    vector<bool> prime;
7
8    int primeSubarray(vector<int>& nums, int k) {
9        int n = nums.size(), mx = 0;
10
11        // maximum value in nums for sieve limit
12        for (int num : nums) mx = max(mx, num);
13
14        map<int, int> mp; // same as TreeMap (sorted)
15        int primes = 0;
16
17        int l1 = 0, l2 = 0;
18
19        sieve(mx);
20
21        int cntK = 0, cnt1 = 0;
22
23        for (int r = 0; r < n; r++) {
24            if (prime[nums[r]]) {
25                primes++;
26                mp[nums[r]]++;
27            }
28
29            while (primes > 1) {
30                if (prime[nums[l1]]) primes--;
31                l1++;
32            }
33
34            // Maintain window [l2..r] with (maxPrime - minPrime) <= k
35            while (!mp.empty() && (mp.rbegin()->first - mp.begin()->first > k)) {
36                if (prime[nums[l2]]) {
37                    mp[nums[l2]]--;
38                    if (mp[nums[l2]] == 0) mp.erase(nums[l2]);
39                }
40                l2++;
41            }
42
43            cnt1 += (r - l1 + 1);
44            cntK += (r - l2 + 1);
45        }
46
47        return cntK - cnt1;
48    }
49
50    void sieve(int n) {
51        prime.assign(n + 1, true);
52        if (n >= 0) prime[0] = false;
53        if (n >= 1) prime[1] = false;
54
55        for (int p = 2; p * p <= n; p++) {
56            if (prime[p]) {
57                for (int i = p * p; i <= n; i += p) {
58                    prime[i] = false;
59                }
60            }
61        }
62    }
63};