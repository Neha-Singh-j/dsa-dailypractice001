// Last updated: 4/24/2026, 4:30:29 PM
1class Solution {
2public:
3    bool isPalindrome(string s) {
4        
5        string temp = "";
6
7        for (int i = 0; i < s.length(); i++) {
8            char c = s[i];
9
10            if ((c >= 'a' && c <= 'z') || 
11                (c >= 'A' && c <= 'Z') || 
12                (c >= '0' && c <= '9')) {
13                
14                temp += tolower(c);
15            }
16        }
17
18        int i = 0;
19        int j = temp.length() - 1;
20
21        while (i <= j) {
22            if (temp[i] != temp[j]) {
23                return false;
24            }
25            i++;
26            j--;
27        }
28
29        return true;
30    }
31};