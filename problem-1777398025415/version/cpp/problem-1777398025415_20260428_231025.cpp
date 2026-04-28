// Last updated: 4/28/2026, 11:10:25 PM
1#include <string>
2#include <vector>
3#include <sstream>
4using namespace std;
5
6class Solution {
7public:
8    string reverseWords(string s) {
9
10        vector<string> arr;
11        stringstream ss(s);
12        string word;
13
14        // split by space
15        while (ss >> word) {
16            arr.push_back(word);
17        }
18
19        int cnt = vowelC(arr[0]);
20
21        for (int i = 1; i < arr.size(); i++) {
22            if (vowelC(arr[i]) == cnt) {
23                arr[i] = rev(arr[i]);
24            }
25        }
26
27        // rebuild string
28        string res = "";
29        for (int i = 0; i < arr.size(); i++) {
30            res += arr[i];
31            if (i != arr.size() - 1) res += " ";
32        }
33
34        return res;
35    }
36
37    string rev(string st) {
38        string curr = "";
39        for (int i = st.length() - 1; i >= 0; i--) {
40            curr += st[i];
41        }
42        return curr;
43    }
44
45    int vowelC(string st) {
46        int c = 0;
47        for (int i = 0; i < st.length(); i++) {
48            char ch = st[i];
49            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
50                c++;
51            }
52        }
53        return c;
54    }
55};