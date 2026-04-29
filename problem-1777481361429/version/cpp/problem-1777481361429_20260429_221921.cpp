// Last updated: 4/29/2026, 10:19:21 PM
1class Solution {
2public:
3    int reverseBits(int n) {
4        int result = 0;
5
6        for (int i = 0; i < 32; i++) {
7            int bit = n & 1;                  // get last bit
8            result = (result << 1) | bit;     // add to result
9            n = n >> 1;                       // shift n
10        }
11
12        return result;
13    }
14};