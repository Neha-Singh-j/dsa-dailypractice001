// Last updated: 5/2/2026, 5:40:46 PM
1#include <vector>
2#include <algorithm>
3using namespace std;
4
5class Solution {
6public:
7    int minIncrementForUnique(vector<int>& arr) {
8        sort(arr.begin(), arr.end());
9
10        int move = 0;
11
12        for (int i = 1; i < arr.size(); i++) {
13            if (arr[i] <= arr[i - 1]) {
14                int incre = arr[i - 1] + 1 - arr[i];
15                move += incre;
16                arr[i] += incre;
17            }
18        }
19
20        return move;
21    }
22};