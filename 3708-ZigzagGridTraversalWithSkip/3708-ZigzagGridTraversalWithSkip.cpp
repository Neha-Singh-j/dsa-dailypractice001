// Last updated: 7/21/2026, 11:51:08 AM
class Solution {
public:
    vector<int> zigzagTraversal(vector<vector<int>>& grid) {
        vector<int> arr;
        int n = grid.size();
        int m = grid[0].size();

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                int j = 0;
                while (j < m) {
                    arr.push_back(grid[i][j]);
                    j += 2;
                }
            } else {
                int j = (m % 2 == 0) ? m - 1 : m - 2;
                while (j >= 0) {
                    arr.push_back(grid[i][j]);
                    j -= 2;
                }
            }

        }
        return arr;
    }
};