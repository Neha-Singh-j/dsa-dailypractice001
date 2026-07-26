// Last updated: 7/26/2026, 10:58:05 PM
class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        int i = 0, j = 0, c = 0;

        sort(g.begin(), g.end());
        sort(s.begin(), s.end());

        while (i < g.size() && j < s.size()) {
            if (g[i] <= s[j]) {
                c++;
                i++;
            }
            j++;
        }

        return c;
    }
};