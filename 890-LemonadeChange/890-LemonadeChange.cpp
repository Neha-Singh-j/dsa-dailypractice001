// Last updated: 7/26/2026, 10:55:23 PM
class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        int n = bills.size();

        // only possible coins to return in change
        int five_dollar = 0, ten_dollar = 0;

        for (int i = 0; i < n; i++) {
            if (bills[i] == 5) {
                five_dollar++;
            } 
            else if (bills[i] == 10 && five_dollar > 0) {
                five_dollar--;
                ten_dollar++;
            } 
            else {
                if (five_dollar > 0 && ten_dollar > 0) {
                    five_dollar--;
                    ten_dollar--;
                } 
                else if (five_dollar > 2) {
                    five_dollar -= 3;
                } 
                else {
                    return false;
                }
            }
        }

        return true;
    }
};