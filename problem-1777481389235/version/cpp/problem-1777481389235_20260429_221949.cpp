// Last updated: 4/29/2026, 10:19:49 PM
1class Solution {
2public:
3    int hammingWeight(uint32_t n) {
4        int c = 0;
5
6        while (n > 0) {
7            c += (n & 1);
8            n >>= 1;   // better than n/=2 for bits
9        }
10
11        return c;
12    }
13};