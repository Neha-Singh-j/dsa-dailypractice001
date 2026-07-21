// Last updated: 7/21/2026, 11:50:37 AM
class Solution {
public:
    int maxProduct(int n) {
        vector<int> arr;

        while (n > 0) {
            arr.push_back(n % 10);
            n /= 10;
        }

        sort(arr.begin(), arr.end(), greater<int>());

        int n1 = arr[0];
        int n2 = arr[1];

        return n1 * n2;
    }
};