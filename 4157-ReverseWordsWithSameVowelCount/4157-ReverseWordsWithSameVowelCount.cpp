// Last updated: 7/12/2026, 12:16:43 AM
#include <string>
#include <vector>
#include <sstream>
using namespace std;

class Solution {
public:
    string reverseWords(string s) {

        vector<string> arr;
        stringstream ss(s);
        string word;

        // split by space
        while (ss >> word) {
            arr.push_back(word);
        }

        int cnt = vowelC(arr[0]);

        for (int i = 1; i < arr.size(); i++) {
            if (vowelC(arr[i]) == cnt) {
                arr[i] = rev(arr[i]);
            }
        }

        // rebuild string
        string res = "";
        for (int i = 0; i < arr.size(); i++) {
            res += arr[i];
            if (i != arr.size() - 1) res += " ";
        }

        return res;
    }

    string rev(string st) {
        string curr = "";
        for (int i = st.length() - 1; i >= 0; i--) {
            curr += st[i];
        }
        return curr;
    }

    int vowelC(string st) {
        int c = 0;
        for (int i = 0; i < st.length(); i++) {
            char ch = st[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                c++;
            }
        }
        return c;
    }
};