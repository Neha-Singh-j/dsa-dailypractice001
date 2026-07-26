// Last updated: 7/26/2026, 10:50:56 PM
class Solution {
public:
    bool squareIsWhite(string s) {
        int ch1 = s[0] - 'a';
        int ch2 = s[1] - '1';

        if ((ch2 % 2 != 0 && ch1 % 2 != 0) || 
            (ch2 % 2 == 0 && ch1 % 2 == 0)) {
            return false;
        }

        return true;
    }
};