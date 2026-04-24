// Last updated: 4/24/2026, 4:31:45 PM
1#include <unordered_map>
2using namespace std;
3
4class Solution {
5public:
6    bool isIsomorphic(string s, string t) {
7        
8        if (s.length() != t.length()) return false;
9
10        unordered_map<char, char> mp;
11
12        for (int i = 0; i < s.length(); i++) {
13            char ch = s[i];
14
15            if (mp.count(ch)) {
16                if (mp[ch] != t[i]) return false;
17            } else {
18                // check if value already mapped
19                for (auto &p : mp) {
20                    if (p.second == t[i]) return false;
21                }
22                mp[ch] = t[i];
23            }
24        }
25
26        return true;
27    }
28};