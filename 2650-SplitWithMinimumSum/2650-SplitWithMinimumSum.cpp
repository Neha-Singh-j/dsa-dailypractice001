// Last updated: 7/21/2026, 11:52:44 AM
class Solution {
public:
    int splitNum(int num) {
        int n1 = 0;
        int n2 = 0;

        string s = to_string(num);
        vector<char> arr(s.begin(), s.end());

        sort(arr.begin(), arr.end());

        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 == 0) {
                n1 = n1 * 10 + (arr[i] - '0');
            } else {
                n2 = n2 * 10 + (arr[i] - '0');
            }
        }

        return n1 + n2;
    }
};