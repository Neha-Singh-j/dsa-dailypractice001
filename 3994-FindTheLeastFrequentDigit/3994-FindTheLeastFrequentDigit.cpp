// Last updated: 7/21/2026, 11:49:57 AM
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int getLeastFrequentDigit(int n) {
        string s = to_string(n);
        int mn = INT_MAX;
        vector<int> arr(10, 0);

        for (int i = 0; i < s.length(); i++) {
            char ch = s[i];
            arr[ch - '0']++;
        }

        int ans = -1;

        for (int i = 0; i < 10; i++) {
            if (arr[i] > 0 && arr[i] < mn) {
                mn = arr[i];
                ans = i;
            }
        }

        return ans;
    }
};