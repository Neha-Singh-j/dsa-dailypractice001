// Last updated: 7/21/2026, 11:51:26 AM
class Solution {
public:
    bool doesAliceWin(string s) {
        int v = countVowel(s);
        if (v == 0) {
            return false;
        }
        return true;
    }

    int countVowel(string s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                c++;
            }
        }
        return c;
    }
};