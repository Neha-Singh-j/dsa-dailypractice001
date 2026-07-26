// Last updated: 7/26/2026, 10:58:44 PM
class Solution {
public:
    bool isSubsequence(string s, string t) {

        int l = 0;
        int r = 0;

        while (l < s.length() && r < t.length()) {
            if (s[l] == t[r]) {
                l++;
            }
            r++;
        }

        return l == s.length();
    }
};