// Last updated: 7/21/2026, 11:49:53 AM
class Solution {
    public long minMoves(int[] balance) {
        int n = balance.length;
        int indx = -1;
        long req = 0;
        long sm = 0;
        long mv = 0;
        for (int i = 0; i < n; i++) {
            sm += balance[i];
            if (balance[i] < 0) {
                indx = i;
                req = -balance[i];
            }
        }
        if (indx == -1) return 0;

        if (sm < 0) return -1;
        List<long[]> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i == indx || balance[i] <= 0)
                continue;
            int currDist = Math.abs(i - indx);
            int dist = Math.min(currDist, n - currDist);
            al.add(new long[]{dist, balance[i]});
        }
        al.sort(Comparator.comparingLong(a -> a[0]));

        for (long[] arr : al) {
            if (req == 0) break;

            long min = Math.min(req, arr[1]);
            mv += min * arr[0];
            req -= min;
        }
        if(req==0) return mv;
        else return -1;
    }
}