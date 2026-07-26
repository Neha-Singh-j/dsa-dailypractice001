// Last updated: 7/26/2026, 10:58:19 PM
#include <vector>
#include <string>
using namespace std;

class Solution {
public:
    vector<int> findAnagrams(string s2, string s1) {
        vector<int> ans;
        if (s2.length() < s1.length()) return ans;

        vector<int> f1(26, 0);
        vector<int> f2(26, 0);

        // initialize first window
        for (int i = 0; i < s1.length(); i++) {
            f1[s1[i] - 'a']++;
            f2[s2[i] - 'a']++;
        }

        if (isAnagram(f1, f2)) ans.push_back(0);

        int end = s1.length();
        int st = 0;

        while (end < s2.length()) {
            f2[s2[end] - 'a']++;
            end++;

            f2[s2[st] - 'a']--;
            st++;

            if (isAnagram(f1, f2)) ans.push_back(st);
        }

        return ans;
    }

private:
    bool isAnagram(vector<int>& pFreq, vector<int>& sFreq) {
        for (int i = 0; i < 26; i++) {
            if (pFreq[i] != sFreq[i]) return false;
        }
        return true;
    }
};