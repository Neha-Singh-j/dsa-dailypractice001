// Last updated: 7/26/2026, 10:57:12 PM
class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        
        if (s2.size() < s1.size()) return false;

        vector<int> f1(26, 0), f2(26, 0);

        // first window
        for (int i = 0; i < s1.size(); i++) {
            f1[s1[i] - 'a']++;
            f2[s2[i] - 'a']++;
        }

        if (same(f1, f2)) return true;

        for (int i = s1.size(); i < s2.size(); i++) {
            f2[s2[i] - 'a']++;                              // add new char
            f2[s2[i - s1.size()] - 'a']--;                  // remove old char

            if (same(f1, f2)) return true;
        }

        return false;
    }

    bool same(vector<int>& f1, vector<int>& f2) {
        for (int i = 0; i < 26; i++) {
            if (f1[i] != f2[i]) return false;
        }
        return true;
    }
};