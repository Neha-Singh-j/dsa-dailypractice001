// Last updated: 7/26/2026, 10:57:52 PM
class Solution {
    public String kthSmallestPath(int[] destination, int k) {
        int V = destination[0];
        int H = destination[1];
        
        StringBuilder ans = new StringBuilder();
        while (V > 0 || H > 0) {
            if (H == 0) {
                ans.append('V');
                V--;
            } else if (V == 0) {
                ans.append('H');
                H--;
            } else {
                long count = nCr(H + V - 1, V);
                
                if (k <= count) {
                    ans.append('H');
                    H--;
                } else {
                    ans.append('V');
                    k -= count;
                    V--;
                }
            }
        }
        return ans.toString();
    }
    private long nCr(int n, int r) {
        r = Math.min(r, n - r);
        long res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (n - r + i) / i;
        }
        return res;
    }
}
