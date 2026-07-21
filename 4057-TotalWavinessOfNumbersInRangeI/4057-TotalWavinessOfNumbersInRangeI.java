// Last updated: 7/21/2026, 11:49:42 AM
class Solution {
    public int totalWaviness(int num1, int num2) {
        int n1 = num1; 
        int c = 0;
        for(int i = n1; i<= num2; i++) {
            c +=check(i);
        }
        return c;
    }
    private int check(int num) {
        String str= String.valueOf(num);
        int n = str.length();
        if (n < 3) return 0;
        int c = 0;
        for (int i = 1; i < n - 1; i++) {
            int a = str.charAt(i - 1)-'0';
            int ch = str.charAt(i)-'0';
            int nx = str.charAt(i + 1)-'0';
            if (ch > a && ch > nx) c++; 
            else if (ch < a && ch < nx) c++;
        }
        return c;
    }
}