// Last updated: 7/21/2026, 11:52:22 AM
class Solution {
public:
    vector<int> findThePrefixCommonArray(vector<int>& A, vector<int>& B) {
        vector<int> arr(A.size());
        vector<int> freq(A.size() + 1, 0);

        int curr = 0;

        for (int i = 0; i < A.size(); i++) {

            int v1 = ++freq[A[i]];
            if (v1 == 2) {
                curr++;
            }

            int v2 = ++freq[B[i]];
            if (v2 == 2) {
                curr++;
            }

            arr[i] = curr;
        }

        return arr;
    }
};