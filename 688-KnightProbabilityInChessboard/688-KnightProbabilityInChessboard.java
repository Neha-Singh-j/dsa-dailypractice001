// Last updated: 7/26/2026, 10:56:18 PM
class Solution {
    double[][][] dp;
    int n;
    int t;

    public double knightProbability(int n, int k, int row, int column) {
        this.n = n;
        this.t = k;

        dp = new double[k + 1][n][n];

        for (int i = 0; i <= k; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    dp[i][j][l] = -1;
                }
            }
        }

        return count(0, row, column);
    }

    public double count(int k, int r, int col) {

        if (r < 0 || col < 0 || r >= n || col >= n) return 0;

        if (k == t) return 1;

        if (dp[k][r][col] != -1) return dp[k][r][col];

        double ans = 0;

        ans += count(k + 1, r + 1, col + 2);
        ans += count(k + 1, r - 1, col + 2);
        ans += count(k + 1, r + 1, col - 2);
        ans += count(k + 1, r - 1, col - 2);
        ans += count(k + 1, r + 2, col + 1);
        ans += count(k + 1, r + 2, col - 1);
        ans += count(k + 1, r - 2, col + 1);
        ans += count(k + 1, r - 2, col - 1);
        ans = ans / 8.0;

        return dp[k][r][col] = ans;
    }
}