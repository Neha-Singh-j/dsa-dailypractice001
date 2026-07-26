// Last updated: 7/26/2026, 10:59:06 PM
class Solution {
public:
    string reverseVowels(string s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            // move left pointer
            while (i < j && !isVowel(s[i])) {
                i++;
            }

            // move right pointer
            while (i < j && !isVowel(s[j])) {
                j--;
            }

            // swap vowels
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }

        return s;
    }

private:
    bool isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }
};