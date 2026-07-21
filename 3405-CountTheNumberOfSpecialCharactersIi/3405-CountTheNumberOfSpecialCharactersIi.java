// Last updated: 7/21/2026, 11:51:34 AM
class Solution {
    public int numberOfSpecialChars(String word) {

        int[] small = new int[26];
        int[] capital = new int[26];

        for(int i = 0; i < word.length(); i++) {

            char ch = word.charAt(i);

            if(ch >= 'a' && ch <= 'z') {
                small[ch - 'a'] = i + 1;
            }
            else {
                if(capital[ch - 'A'] == 0) {
                    capital[ch - 'A'] = i + 1;
                }
            }
        }

        int ans = 0;

        for(int i = 0; i < 26; i++) {

            if(small[i] != 0 &&
               capital[i] != 0 &&
               small[i] < capital[i]) {

                ans++;
            }
        }

        return ans;
    }
}