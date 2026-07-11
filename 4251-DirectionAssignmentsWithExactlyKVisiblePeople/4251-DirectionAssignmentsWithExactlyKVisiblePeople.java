// Last updated: 7/12/2026, 12:16:22 AM
import java.util.*;

class Solution {
    static final int MOD = 1000000007;

    static long power(long a, long b) {
        long r = 1;
        while (b > 0) {
            if ((b & 1) == 1) r = (r * a) % MOD;
            a = (a * a) % MOD;
            b >>= 1;
        }
        return r;
    }

    public int countVisiblePeople(int n, int pos, int k) {
        int l = pos;
        int r = n - pos - 1;

        build(n);

        long ans = 0;

        for (int x = Math.max(0, k - r); x <= Math.min(l, k); x++) {
            int y = k - x;
            long w = (permu(l, x) * permu(r, y)) % MOD;
            ans = (ans + w) % MOD;
        }

        ans = (ans * 2) % MOD;

        return (int) ans;
    }

    static long[] fa, f;

    static void build(int n) {
        fa = new long[n + 1];
        f = new long[n + 1];

        fa[0] = 1;
        for (int i = 1; i <= n; i++)
            fa[i] = (fa[i - 1] * i) % MOD;

        f[n] = power(fa[n], MOD - 2);
        for (int i = n - 1; i >= 0; i--)
            f[i] = (f[i + 1] * (i + 1)) % MOD;
    }

    static long permu(int n, int r) {
        if (r < 0 || r > n) return 0;
        return (fa[n] * f[r] % MOD * f[n - r] % MOD) % MOD;
    }
}