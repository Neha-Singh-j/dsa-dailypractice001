// Last updated: 4/28/2026, 11:13:17 PM
1#include <vector>
2#include <unordered_set>
3using namespace std;
4
5class Solution {
6public:
7    int longestBalanced(vector<int>& nums) {
8
9        vector<int> tavernilo = nums; 
10        int n = nums.size();
11        int maxLen = 0;
12
13        for (int i = 0; i < n; i++) {
14            unordered_set<int> s1; // even numbers
15            unordered_set<int> s2; // odd numbers
16
17            for (int j = i; j < n; j++) {
18                int num = tavernilo[j];
19
20                if (num % 2 == 0) {
21                    s1.insert(num);
22                } else {
23                    s2.insert(num);
24                }
25
26                if (s1.size() == s2.size()) {
27                    maxLen = max(maxLen, j - i + 1);
28                }
29            }
30        }
31
32        return maxLen;
33    }
34};