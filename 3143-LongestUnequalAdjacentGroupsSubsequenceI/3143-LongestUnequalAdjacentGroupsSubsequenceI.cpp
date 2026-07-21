// Last updated: 7/21/2026, 11:52:00 AM
class Solution {
public:
    vector<string> getLongestSubsequence(vector<string>& words, vector<int>& groups) {
        vector<string> arr;

        arr.push_back(words[0]);
        int curr = groups[0];

        for (int i = 1; i < groups.size(); i++) {
            if (groups[i] != curr) {
                arr.push_back(words[i]);
                curr = groups[i];
            }
        }

        return arr;
    }
};