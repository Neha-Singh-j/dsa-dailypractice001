// Last updated: 7/26/2026, 10:56:51 PM
class Solution {
    public int maximumProduct(int[] arr) {
        int fe = Integer.MIN_VALUE, se = Integer.MIN_VALUE, te = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int it : arr) {
            if (it > fe) {
                te = se;
                se = fe;
                fe = it;
            } else if (it > se) {
                te = se;
                se = it;
            } else if (it > te) {
                te = it;
            }
            
            if (it < min1) {
                min2 = min1;
                min1 = it;
            } else if (it < min2) {
                min2 = it;
            }
        }
        return Math.max(fe * se * te, fe * min1 * min2);
    }
}