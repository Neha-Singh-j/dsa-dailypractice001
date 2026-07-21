// Last updated: 7/21/2026, 11:50:44 AM
class Solution {
    public int longestPalindrome(String s, String t) {
        int n = s.length(), m = t.length();

        int[] p = boolStart(s); 
        int[] q = boolEnd(t);   
        int[][] dp = new int[n][m];
        int ans = 0;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    int best = 2;

                    if (i + 1 < n && j - 1 >= 0) {
                        best = Math.max(best, 2 + dp[i + 1][j - 1]);
                    }

                    if (i + 1 < n) {
                        best = Math.max(best, 2 + p[i + 1]);
                    }

                    if (j - 1 >= 0) {
                        best = Math.max(best, 2 + q[j - 1]);
                    }

                    dp[i][j] = Math.max(best, Math.max(p[i], q[j]));
                } else {
                    dp[i][j] = Math.max(p[i], q[j]);
                }

                ans = Math.max(ans, dp[i][j]);
            }
        }

        for (int x : p) ans = Math.max(ans, x);
        for (int x : q) ans = Math.max(ans, x);

        return ans;
    }

    private int[] boolStart(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) &&
                    (j - i < 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    res[i] = Math.max(res[i], j - i + 1);
                }
            }
        }
        return res;
    }

    private int[] boolEnd(String t) {
        int n = t.length();
        boolean[][] dp = new boolean[n][n];
        int[] res = new int[n];

        for (int j = 0; j < n; j++) {
            for (int i = j; i >= 0; i--) {
                if (t.charAt(i) == t.charAt(j) &&
                    (j - i < 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    res[j] = Math.max(res[j], j - i + 1);
                }
            }
        }
        return res;
    }
}
