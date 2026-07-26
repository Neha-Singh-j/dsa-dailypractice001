// Last updated: 7/26/2026, 11:00:13 PM
class Solution {
public:
    bool wordPattern(string pattern, string s) {
        unordered_map<char, string> map1;
        unordered_set<string> used;

        vector<string> arr;
        string word = "";

        // split string by space
        for (int i = 0; i < s.size(); i++) {
            if (s[i] == ' ') {
                arr.push_back(word);
                word = "";
            } else {
                word += s[i];
            }
        }
        arr.push_back(word); // last word

        if (pattern.size() != arr.size()) return false;

        for (int i = 0; i < pattern.size(); i++) {
            char ch = pattern[i];

            if (!map1.count(ch)) {
                if (used.count(arr[i])) return false;

                map1[ch] = arr[i];
                used.insert(arr[i]);
            } 
            else {
                if (map1[ch] != arr[i]) return false;
            }
        }

        return true;
    }
};