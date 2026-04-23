// Last updated: 4/23/2026, 8:51:30 PM
1#include <vector>
2#include <climits>
3using namespace std;
4
5class Solution {
6public:
7    int maxProfit(vector<int>& prices) {
8        int minPrice = INT_MAX;
9        int maxProfit = 0;
10
11        for (int price : prices) {
12            minPrice = min(minPrice, price);
13            maxProfit = max(maxProfit, price - minPrice);
14        }
15
16        return maxProfit;
17    }
18};