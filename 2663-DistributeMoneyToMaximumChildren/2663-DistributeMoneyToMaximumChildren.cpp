// Last updated: 7/21/2026, 11:52:41 AM
class Solution {
public:
    int distMoney(int money, int children) {

        if (money < children) return -1;
        if (money == 4 && children == 1) return -1;

        int rem = money - children; // given 1 to each child, remaining money
        int c = min(children, rem / 7);

        if (c == children && rem - c * 7 > 0) {  // everyone gets 8 but extra remains
            c--;
        }

        if (rem - c * 7 == 3 && children - c == 1) { // avoid giving 4
            c--;
        }

        // greedy result
        return max(0, c);
    }
};