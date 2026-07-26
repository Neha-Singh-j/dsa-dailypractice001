// Last updated: 7/26/2026, 10:48:23 PM
class Solution {
    public int pivotInteger(int n) {
        int sum = 0, i = 1;

        // total sum
        while (i <= n) {
            sum += i;
            i++;
        }

        int curr = 0;
        i = 1;

        while (i <= n) {
            curr += i;  // include i first

            if (curr == sum - curr + i) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
