// Last updated: 7/26/2026, 10:56:36 PM
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> findClosestElements(vector<int>& arr, int k, int x) {
        int lo = 0;
        int hi = arr.size() - k;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (x - arr[mid] > arr[mid + k] - x) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        vector<int> result;
        for (int i = lo; i < lo + k; i++) {
            result.push_back(arr[i]);
        }

        return result;
    }
};