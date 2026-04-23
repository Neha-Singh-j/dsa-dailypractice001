// Last updated: 4/23/2026, 9:23:25 PM
1class Solution {
2public:
3    vector<string> fizzBuzz(int n) {
4        vector<string> arr;
5
6        for (int i = 1; i <= n; i++) {
7            if (i % 3 == 0 && i % 5 == 0) {
8                arr.push_back("FizzBuzz");
9            } 
10            else if (i % 3 == 0) {
11                arr.push_back("Fizz");
12            } 
13            else if (i % 5 == 0) {
14                arr.push_back("Buzz");
15            } 
16            else {
17                arr.push_back(to_string(i));
18            }
19        }
20
21        return arr;
22    }
23};