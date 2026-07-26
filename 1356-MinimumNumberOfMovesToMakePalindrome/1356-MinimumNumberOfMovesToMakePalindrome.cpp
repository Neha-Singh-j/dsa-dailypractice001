// Last updated: 7/26/2026, 10:53:13 PM
class Solution {
public:
    int minMovesToMakePalindrome(string s) {
        int ans = 0;
        int n = s.size();

        int i = 0, j = n - 1;

        while (i < j) {
            int k = j;

            while (k > i && s[k] != s[i])
                k--;

            if (k == i) {  // unique middle character
                swap(s[i], s[i + 1]);
                ans++;
            } else {
                while (k < j) {
                    swap(s[k], s[k + 1]);
                    ans++;
                    k++;
                }
                i++;
                j--;
            }
        }

        return ans;
    }
};