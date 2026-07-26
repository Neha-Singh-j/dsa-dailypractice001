// Last updated: 7/26/2026, 10:58:37 PM
class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char, int> map;

        for (int i = 0; i < s.length(); i++) {
            char ch = s[i];
            map[ch]++;
        }

        bool flag = false;
        int c = 0;

        for (auto &p : map) {
            char ch = p.first;
            int freq = p.second;

            if (freq > 1) {
                if (freq % 2 == 0) {
                    c += freq;
                } 
                else if (!flag) {
                    c += freq;
                    flag = true;
                } 
                else {
                    c += (freq - 1);
                }
            } 
            else {
                if (!flag && freq == 1) {
                    flag = true;
                    c++;
                }
            }
        }

        return c;
    }
};