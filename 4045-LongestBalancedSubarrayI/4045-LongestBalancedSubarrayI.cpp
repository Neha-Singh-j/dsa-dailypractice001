// Last updated: 7/21/2026, 11:49:47 AM
#include <vector>
#include <unordered_set>
using namespace std;

class Solution {
public:
    int longestBalanced(vector<int>& nums) {

        vector<int> tavernilo = nums; 
        int n = nums.size();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            unordered_set<int> s1; // even numbers
            unordered_set<int> s2; // odd numbers

            for (int j = i; j < n; j++) {
                int num = tavernilo[j];

                if (num % 2 == 0) {
                    s1.insert(num);
                } else {
                    s2.insert(num);
                }

                if (s1.size() == s2.size()) {
                    maxLen = max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }
};