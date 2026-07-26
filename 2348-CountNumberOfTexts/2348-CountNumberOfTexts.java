// Last updated: 7/26/2026, 10:49:29 PM
class Solution {
    static final int MOD = 1000000007;
    public int countTexts(String str) {
        int n = str.length();
        long ans = 1;
        int i = 0;
        while (i < n) {
            char ch = str.charAt(i);
            int j = i;
            while (j < n && str.charAt(j) == ch) {
                j++;
            }
            int len = j - i;
            if (ch == '7' || ch == '9') {
                ans = (ans * ways(len, 4)) % MOD;
            } else {
                ans = (ans * ways(len, 3)) % MOD;
            }

            i = j;
        }

        return (int) ans;
    }
    private long ways(int n, int k) {
        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k && j <= i; j++) {
                dp[i] = (dp[i] + dp[i - j]) % MOD;
            }
        }
        return dp[n];
    }
}
