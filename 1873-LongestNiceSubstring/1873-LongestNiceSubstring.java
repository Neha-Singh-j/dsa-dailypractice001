// Last updated: 7/26/2026, 10:51:28 PM
class Solution {
    public String longestNiceSubstring(String s) {

        int n = s.length();
        String res = "";

        for (int lo = 0; lo < n; lo++) {
            boolean[] cap = new boolean[26];
            boolean[] small = new boolean[26];

            for (int hi = lo; hi < n; hi++) {
                char ch = s.charAt(hi);

                if (Character.isLowerCase(ch))
                    small[ch - 'a'] = true;
                else
                    cap[ch - 'A'] = true;

                if (isNice(cap, small)) {
                    if (hi - lo + 1 > res.length()) {
                        res = s.substring(lo, hi + 1);
                    }
                }
            }
        }
        return res;
    }

    private boolean isNice(boolean[] cap, boolean[] small) {
        for (int i = 0; i < 26; i++) {
            if (cap[i] ^ small[i]) return false; // only one present
        }
        return true;
    }
}
