// Last updated: 7/12/2026, 12:16:20 AM
class Solution {
public:
    int firstMatchingIndex(string s) {
        int a = 0;
        int b = s.length() - 1;

        while (a <= b) {
            if (s[a] == s[b]) return a;
            a++;
            b--;
        }

        return -1;
    }
};