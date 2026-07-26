// Last updated: 7/26/2026, 10:59:38 PM
import java.util.*;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;

        int[][] dp = new int[amount + 1][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = find(dp, amount, 0, coins);

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    public static int find(int[][] dp, int amt, int i, int[] coins) {

        if (amt == 0)
            return 0;

        if (i == coins.length)
            return Integer.MAX_VALUE;

        if (dp[amt][i] != -1)
            return dp[amt][i];

        // Include
        int include = Integer.MAX_VALUE;
        if (amt >= coins[i]) {
            int res = find(dp, amt - coins[i], i, coins);
            if (res != Integer.MAX_VALUE)
                include = 1 + res;
        }

        // Exclude
        int exclude = find(dp, amt, i + 1, coins);

        return dp[amt][i] = Math.min(include, exclude);
    }
}