// Last updated: 7/12/2026, 12:16:27 AM
class Solution {
    public int minCost(int[][] g) {
        int r = g.length;
        int c = g[0].length;

        boolean[][] dp = new boolean[c][1024];
        dp[0][g[0][0]] = true;

        for (int j = 1; j < c; j++) {
            for (int x = 0; x < 1024; x++) {
                if (dp[j - 1][x]) {
                    dp[j][x ^ g[0][j]] = true;
                }
            }
        }

        for (int i = 1; i < r; i++) {
            boolean[][] ndp = new boolean[c][1024];

            for (int x = 0; x < 1024; x++) {
                if (dp[0][x]) {
                    ndp[0][x ^ g[i][0]] = true;
                }
            }

            for (int j = 1; j < c; j++) {
                for (int x = 0; x < 1024; x++) {
                    if (dp[j][x]) {
                        ndp[j][x ^ g[i][j]] = true;
                    }
                    if (ndp[j - 1][x]) {
                        ndp[j][x ^ g[i][j]] = true;
                    }
                }
            }

            dp = ndp;
        }

        for (int x = 0; x < 1024; x++) {
            if (dp[c - 1][x]) return x;
        }

        return -1;
    }
}