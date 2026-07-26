// Last updated: 7/26/2026, 10:49:07 PM
class Solution {
public:
    int latestTimeCatchTheBus(vector<int>& buses, vector<int>& passengers, int cap) {

        int n1 = buses.size(), n2 = passengers.size();
        int j = 0;
        int ans = 0;

        unordered_set<int> st;

        sort(buses.begin(), buses.end());
        sort(passengers.begin(), passengers.end());

        for (int i = 0; i < n1; i++) {
            int c = 0;

            while (c < cap && j < n2 && passengers[j] <= buses[i]) {

                if (st.find(passengers[j] - 1) == st.end()) {
                    ans = passengers[j] - 1;
                }

                st.insert(passengers[j]);
                c++;
                j++;
            }

            if (c < cap && st.find(buses[i]) == st.end()) {
                ans = buses[i];
            }
        }

        return ans;
    }
};