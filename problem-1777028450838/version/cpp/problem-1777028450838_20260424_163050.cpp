// Last updated: 4/24/2026, 4:30:50 PM
1class Solution {
2public:
3    bool isHappy(int n) {
4        
5        while (n != 1 && n != 4) {
6            int sum = 0;
7
8            while (n > 0) {
9                int rem = n % 10;
10                sum += rem * rem;
11                n /= 10;
12            }
13
14            n = sum;
15        }
16
17        return n == 1;
18    }
19};