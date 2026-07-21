// Last updated: 7/21/2026, 11:52:55 AM
class Solution {
public:
    int getCommon(vector<int>& nums1, vector<int>& nums2) {
        unordered_set<int> st;

        for (int x : nums2) {
            st.insert(x);
        }

        for (int x : nums1) {
            if (st.count(x)) {
                return x;
            }
        }

        return -1;
    }
};