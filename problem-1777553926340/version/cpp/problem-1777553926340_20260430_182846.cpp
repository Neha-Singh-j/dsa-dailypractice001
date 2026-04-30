// Last updated: 4/30/2026, 6:28:46 PM
1#include <bits/stdc++.h>
2using namespace std;
3
4class Solution {
5public:
6    int getLeastFrequentDigit(int n) {
7        string s = to_string(n);
8        int mn = INT_MAX;
9        vector<int> arr(10, 0);
10
11        for (int i = 0; i < s.length(); i++) {
12            char ch = s[i];
13            arr[ch - '0']++;
14        }
15
16        int ans = -1;
17
18        for (int i = 0; i < 10; i++) {
19            if (arr[i] > 0 && arr[i] < mn) {
20                mn = arr[i];
21                ans = i;
22            }
23        }
24
25        return ans;
26    }
27};