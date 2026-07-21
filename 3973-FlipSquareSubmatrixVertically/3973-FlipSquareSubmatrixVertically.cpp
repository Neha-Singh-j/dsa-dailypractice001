// Last updated: 7/21/2026, 11:50:02 AM
class Solution {
public:
    vector<vector<int>> reverseSubmatrix(vector<vector<int>>& grid, int x, int y, int k) {
        int t = x;
        int b = x + k - 1;

        vector<vector<int>> res = grid; // copy of grid

        while (t < b) {
            for (int j = y; j < y + k; j++) {
                int temp = res[t][j];
                res[t][j] = res[b][j];
                res[b][j] = temp;
            }
            t++;
            b--;
        }

        return res;
    }
};