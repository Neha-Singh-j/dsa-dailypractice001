// Last updated: 7/26/2026, 10:51:42 PM
class Solution {
public:
    int maximumUnits(vector<vector<int>>& boxTypes, int truckSize) {
        
        sort(boxTypes.begin(), boxTypes.end(), [](vector<int>& a, vector<int>& b) {
            return a[1] > b[1]; // sort in descending order of units
        });

        int ans = 0;

        for (int i = 0; i < boxTypes.size(); i++) {
            vector<int>& box = boxTypes[i];

            if (box[0] <= truckSize) {
                ans += (box[0] * box[1]);
                truckSize -= box[0];
            } 
            else if (truckSize > 0) {
                ans += (truckSize * box[1]);
                truckSize = 0;
            } 
            else {
                return ans;
            }
        }

        return ans;
    }
};