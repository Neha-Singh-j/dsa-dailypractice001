// Last updated: 7/26/2026, 10:54:57 PM
class Solution {
    public int minDeletionSize(String[] strs) {
        int rn = strs.length;
        int m = strs[0].length();
        int c = 0;

        for (int i = 0; i < m; i++) { //column
            for (int j = 0; j < rn - 1; j++) { //row
                if (strs[j].charAt(i) > strs[j + 1].charAt(i)) {
                    c++;
                    break; // delete this iumn
                }
            }
        }
        return c;
    }
}
