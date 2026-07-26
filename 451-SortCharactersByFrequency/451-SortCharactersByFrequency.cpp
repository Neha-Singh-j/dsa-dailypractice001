// Last updated: 7/26/2026, 10:58:10 PM
#include <vector>
#include <string>
using namespace std;

class Solution {
public:
    string frequencySort(string s) {
        vector<int> freq(128, 0);

        for (char c : s) {
            freq[c]++;
        }

        string result = "";
        int i = 0;

        while (i < s.length()) {
            int maxFreq = -1;
            int idx = 0;

            for (int j = 0; j < 128; j++) {
                if (freq[j] > maxFreq) {
                    maxFreq = freq[j];
                    idx = j;
                }
            }

            while (maxFreq-- > 0) {
                result += (char)idx;
                i++;
            }

            freq[idx] = 0;
        }

        return result;
    }
};