// Last updated: 4/23/2026, 8:50:55 PM
1#include <vector>
2using namespace std;
3
4class Solution {
5public:
6    int majorityElement(vector<int>& nums) {
7        return mooreVoting(nums);
8    }
9
10    int mooreVoting(vector<int>& arr) {
11        int e = arr[0];
12        int v = 1;
13        int n = arr.size();
14
15        for (int i = 1; i < n; i++) {
16            if (arr[i] == e) {
17                v++;
18            } else {
19                v--;
20                if (v == 0) {
21                    e = arr[i];
22                    v = 1;
23                }
24            }
25        }
26        return e;
27    }
28};