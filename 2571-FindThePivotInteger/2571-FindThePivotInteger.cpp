// Last updated: 7/21/2026, 11:53:29 AM
class Solution {
public:
    int pivotInteger(int n) {
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
};