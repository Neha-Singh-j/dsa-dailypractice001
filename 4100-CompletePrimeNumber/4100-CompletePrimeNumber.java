// Last updated: 7/21/2026, 11:49:31 AM
class Solution {
    public boolean completePrime(int num) {
        String s=String.valueOf(num);
        int n=s.length();
       if (n == 1) {
            return isPrime(num);
        }
        for (int k = 1; k <= n; k++) {
            if (!prime(num, k)) {
                return false;
            }
        }
        return true;
    }
    public static boolean prime(int num, int k) {
        String s = String.valueOf(num);

        int prefix = Integer.parseInt(s.substring(0, k));
        int suffix = Integer.parseInt(s.substring(s.length() - k));

        if (!isPrime(prefix) || !isPrime(suffix)) return false;

        return true;
    }

    public static boolean isPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
}