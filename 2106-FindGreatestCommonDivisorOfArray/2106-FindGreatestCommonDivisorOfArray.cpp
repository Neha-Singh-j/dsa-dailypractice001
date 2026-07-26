// Last updated: 7/26/2026, 10:50:26 PM
class Solution {
public:
    int findGCD(vector<int>& nums) {
        int minVal = INT_MAX;
        int maxVal = INT_MIN;

        for (int num : nums) {
            if (num < minVal) minVal = num;
            if (num > maxVal) maxVal = num;
        }

        return gcd(minVal, maxVal);
    }

    int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
};