// Last updated: 6/26/2026, 10:45:22 PM
1class Solution {
2    public boolean repeatedSubstringPattern(String s) {
3        int n = s.length();
4
5        for(int len = 1; len <= n / 2; len++) {
6
7            if(n % len != 0) continue;
8
9            String sub = s.substring(0, len);
10            boolean valid = true;
11
12            for(int i = len; i < n; i += len) {
13                if(!s.substring(i, i + len).equals(sub)) {
14                    valid = false;
15                    break;
16                }
17            }
18
19            if(valid) return true;
20        }
21
22        return false;
23    }
24}