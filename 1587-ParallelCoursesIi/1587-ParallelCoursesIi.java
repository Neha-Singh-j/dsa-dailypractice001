// Last updated: 7/26/2026, 10:52:18 PM
class Solution {
    public int minNumberOfSemesters(int n, int[][] relations, int k) {
        int[] pre = new int[n];

        for (int[] r : relations) {
            int u = r[0] - 1;
            int v = r[1] - 1;
            pre[v] |= (1 << u);
        }

        int N = 1 << n;
        int[] dp = new int[N];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i < N; i++) {   
            if (dp[i] == Integer.MAX_VALUE) continue;

            int canTake = 0;

            for (int j = 0; j < n; j++) {   
                if ((i & (1 << j)) == 0 && (pre[j] & i) == pre[j]) {
                    canTake |= (1 << j);
                }
            }

            for (int s = canTake; s > 0; s = (s - 1) & canTake) {
                if (Integer.bitCount(s) <= k) {
                    int next = i | s;
                    dp[next] = Math.min(dp[next], dp[i] + 1);
                }
            }
        }

        return dp[N - 1];
    }
}
