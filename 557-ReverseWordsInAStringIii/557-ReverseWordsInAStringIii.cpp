// Last updated: 7/26/2026, 10:57:13 PM
class Solution {
public:
    string reverseWords(string s) {
        stringstream ss(s);
        string word;
        string result = "";

        while (ss >> word) {
            for (int j = word.length() - 1; j >= 0; j--) {
                result += word[j];
            }
            result += ' ';
        }

        result.pop_back(); // remove last space
        return result;
    }
};