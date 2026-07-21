// Last updated: 7/21/2026, 11:49:17 AM
class Solution {
public:
    int minimumFlips(int n) {
        string s = decToBin(n);
        int i = 0;
        int j = s.length() - 1;
        int c = 0;

        while (i <= j) {
            if (s[i] != s[j]) c += 2;
            i++;
            j--;
        }
        return c;
    }

    string decToBin(int n) {
        string s = "";
        while (n > 0) {
            int rem = n % 2;
            s += (rem + '0');   // convert int to char
            n = n / 2;
        }
        reverse(s.begin(), s.end());
        return s;
    }
};