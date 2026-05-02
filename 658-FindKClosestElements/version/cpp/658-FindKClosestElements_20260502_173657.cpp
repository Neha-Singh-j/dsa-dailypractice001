// Last updated: 5/2/2026, 5:36:57 PM
1#include <vector>
2using namespace std;
3
4class Solution {
5public:
6    vector<int> findClosestElements(vector<int>& arr, int k, int x) {
7        int lo = 0;
8        int hi = arr.size() - k;
9
10        while (lo < hi) {
11            int mid = lo + (hi - lo) / 2;
12
13            if (x - arr[mid] > arr[mid + k] - x) {
14                lo = mid + 1;
15            } else {
16                hi = mid;
17            }
18        }
19
20        vector<int> result;
21        for (int i = lo; i < lo + k; i++) {
22            result.push_back(arr[i]);
23        }
24
25        return result;
26    }
27};