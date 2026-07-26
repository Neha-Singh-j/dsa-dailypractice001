// Last updated: 7/26/2026, 10:57:58 PM
class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[] c1 = new int[strs.length];
        int[] c0 = new int[strs.length];
        int i = 0;
        for (String s : strs) {
            c1[i] = count(s, '1');
            c0[i] = count(s, '0');
            i++;
        }
        
        int[][][] dp = new int[strs.length][m+1][n+1];
        for ( i = 0; i < strs.length; i++) {
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }
        return Knapsack(c0, c1, m, n, 0, dp);
    }

    public static int Knapsack(int[] c0, int[] c1, int m, int n, int i , int[][][] dp) {
        if (i == c0.length) return 0;
       if (dp[i][m][n] != -1) return dp[i][m][n];

        int inc = 0;
        if (m >= c0[i] && n >= c1[i]) {
            inc = 1 + Knapsack(c0, c1, m - c0[i], n - c1[i], i + 1, dp);
        }

        int exc = Knapsack(c0, c1, m, n, i + 1,dp);

        return dp[i][m][n]=Math.max(inc, exc);
    }

    public static int count(String s, char ch) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) c++;
        }
        return c;
    }
}
