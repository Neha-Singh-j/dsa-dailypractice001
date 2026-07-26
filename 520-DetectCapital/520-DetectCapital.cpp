// Last updated: 7/26/2026, 10:57:42 PM
class Solution {
public:
    bool detectCapitalUse(string word) {
        int count = 0;
        bool first = false;

        for (int i = 0; i < word.length(); i++) {

            if (word[0] >= 'A' && word[0] <= 'Z') {
                first = true;
            }

            if (word[i] >= 'A' && word[i] <= 'Z') {
                count++;
            }
        }

        if (count == 1 && !first) {
            return false;
        }

        if (count == word.length() || count == 1 || count == 0) {
            return true;
        }

        return false;
    }
};