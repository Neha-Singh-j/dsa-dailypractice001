// Last updated: 7/21/2026, 11:50:49 AM
class Solution {
public:
    int countArrays(vector<int>& original, vector<vector<int>>& bounds) {
        int n = original.size();
        long long l = bounds[0][0];
        long long u = bounds[0][1];

        for (int i = 1; i < n; i++) {
            int diff = original[i] - original[i - 1];
            l += diff;
            u += diff;

            l = max(l, (long long)bounds[i][0]);
            u = min(u, (long long)bounds[i][1]);

            if (l > u) {
                return 0;
            }
        }
        return (int)(u - l + 1);
    }
};