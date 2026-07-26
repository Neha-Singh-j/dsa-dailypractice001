// Last updated: 7/26/2026, 10:54:59 PM
#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    int minIncrementForUnique(vector<int>& arr) {
        sort(arr.begin(), arr.end());

        int move = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (arr[i] <= arr[i - 1]) {
                int incre = arr[i - 1] + 1 - arr[i];
                move += incre;
                arr[i] += incre;
            }
        }

        return move;
    }
};