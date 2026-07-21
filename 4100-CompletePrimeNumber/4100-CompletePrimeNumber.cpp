// Last updated: 7/21/2026, 11:49:19 AM
#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    bool completePrime(int num) {
        string s = to_string(num);
        int n = s.length();

        if (n == 1) {
            return isPrime(num);
        }

        for (int k = 1; k <= n; k++) {
            if (!prime(num, k)) {
                return false;
            }
        }
        return true;
    }

    bool prime(int num, int k) {
        string s = to_string(num);

        int prefix = stoi(s.substr(0, k));
        int suffix = stoi(s.substr(s.length() - k));

        if (!isPrime(prefix) || !isPrime(suffix)) return false;

        return true;
    }

    bool isPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
};