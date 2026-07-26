// Last updated: 7/26/2026, 10:54:32 PM
class Solution {
public:
    int findJudge(int n, vector<vector<int>>& trust) {
        // maintaining indegree and outdegree
        vector<int> nposs(n + 1, 0); // indegree
        vector<int> poss(n + 1, 0);  // outdegree

        for (int i = 0; i < trust.size(); i++) {
            nposs[trust[i][1]]++;
            poss[trust[i][0]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (poss[i] == 0 && nposs[i] == (n - 1)) {
                return i; // judge found
            }
        }
        return -1;
    }
};