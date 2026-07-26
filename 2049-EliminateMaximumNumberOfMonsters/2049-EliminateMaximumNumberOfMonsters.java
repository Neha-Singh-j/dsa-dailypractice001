// Last updated: 7/26/2026, 10:50:40 PM
    import java.util.*;
    class Solution {
        public int eliminateMaximum(int[] dist, int[] speed) {
            int n = dist.length;
            double[] res = new double[n];
            for (int i = 0; i < n; i++) {
                res[i] = (double) dist[i]/speed[i];
            }
            Arrays.sort(res);
            for (int i =0; i<n;i++) {
                if (res[i] <= i) {
                    return i; 
                }
            }
            return n; 
    }
}
