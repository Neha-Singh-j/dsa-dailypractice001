// Last updated: 7/26/2026, 10:49:48 PM
class Solution {
public:
    int countEven(int num) {

        int c = 0;
        int i = 1;

        while (i <= num) {
            if (cEven(i)) {
                c++;
            }
            i++;
        }

        return c;
    }

    bool cEven(int n) {
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }

        return sum % 2 == 0;
    }
};