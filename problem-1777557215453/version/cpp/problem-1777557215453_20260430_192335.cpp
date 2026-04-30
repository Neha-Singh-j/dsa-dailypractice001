// Last updated: 4/30/2026, 7:23:35 PM
1#include <bits/stdc++.h>
2using namespace std;
3
4class Solution {
5public:
6    bool completePrime(int num) {
7        string s = to_string(num);
8        int n = s.length();
9
10        if (n == 1) {
11            return isPrime(num);
12        }
13
14        for (int k = 1; k <= n; k++) {
15            if (!prime(num, k)) {
16                return false;
17            }
18        }
19        return true;
20    }
21
22    bool prime(int num, int k) {
23        string s = to_string(num);
24
25        int prefix = stoi(s.substr(0, k));
26        int suffix = stoi(s.substr(s.length() - k));
27
28        if (!isPrime(prefix) || !isPrime(suffix)) return false;
29
30        return true;
31    }
32
33    bool isPrime(int x) {
34        if (x <= 1) return false;
35        for (int i = 2; i * i <= x; i++) {
36            if (x % i == 0) return false;
37        }
38        return true;
39    }
40};