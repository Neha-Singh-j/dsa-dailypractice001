// Last updated: 7/21/2026, 11:52:33 AM
class Solution {
     long MOD = 1_000_000_007;
    public int monkeyMove(int n) {
        long ans = pow(2, n);
        return (int)((ans - 2 + MOD) % MOD);
    }

    private long pow(long base, long exp) {
        long res = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                res = (res * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return res;
    }
}
