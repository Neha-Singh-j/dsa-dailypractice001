// Last updated: 5/2/2026, 5:35:17 PM
1#include <vector>
2#include <string>
3using namespace std;
4
5class Solution {
6public:
7    string frequencySort(string s) {
8        vector<int> freq(128, 0);
9
10        for (char c : s) {
11            freq[c]++;
12        }
13
14        string result = "";
15        int i = 0;
16
17        while (i < s.length()) {
18            int maxFreq = -1;
19            int idx = 0;
20
21            for (int j = 0; j < 128; j++) {
22                if (freq[j] > maxFreq) {
23                    maxFreq = freq[j];
24                    idx = j;
25                }
26            }
27
28            while (maxFreq-- > 0) {
29                result += (char)idx;
30                i++;
31            }
32
33            freq[idx] = 0;
34        }
35
36        return result;
37    }
38};