// Last updated: 7/26/2026, 10:55:31 PM
class Solution {
public:
    bool backspaceCompare(string s, string t) {
        stack<char> st1;
        stack<char> st2;

        for (int i = 0; i < s.length(); i++) {
            char ch = s[i];
            if (ch != '#') {
                st1.push(ch);
            } else {
                if (!st1.empty())
                    st1.pop();
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t[i];
            if (ch != '#') {
                st2.push(ch);
            } else {
                if (!st2.empty())
                    st2.pop();
            }
        }

        if (st1.size() != st2.size()) {
            return false;
        }

        while (!st1.empty() && !st2.empty()) {
            char a = st1.top(); st1.pop();
            char b = st2.top(); st2.pop();
            if (a != b) return false;
        }

        return true;
    }
};