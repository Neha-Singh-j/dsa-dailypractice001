// Last updated: 7/26/2026, 10:50:43 PM
class Solution {
    public String maxValue(String n, int x) {
        String ans = "";
        char chx = (char)(x + '0');
        if (n.charAt(0) == '-') {
            for (int i = 1; i < n.length(); i++) {
                int ch = n.charAt(i) - '0';

                if (ch > x) {  
                    return n.substring(0, i) + chx + n.substring(i);
                }
            }
            return n + chx;

        } else {
            for (int i = 0; i < n.length(); i++) {
                int ch = n.charAt(i) - '0';

                if (ch < x) {
                    return n.substring(0, i) + chx + n.substring(i);
                }
            }
            return n + chx;
        }
    }
}