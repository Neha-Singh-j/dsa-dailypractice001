// Last updated: 7/26/2026, 10:49:31 PM
class Solution {
    public int largestVariance(String s) {
        int ans = 0;
    //tc is 26*26*n 
        for (char x = 'a'; x <= 'z'; x++) { //constant time loops
            for (char y = 'a'; y <= 'z'; y++) { //constant time 
                if (x == y) continue;
                ans = Math.max(ans, isValidMaxVarience(s, x, y));
                String rev = new StringBuilder(s).reverse().toString();
                ans = Math.max(ans, isValidMaxVarience(rev, x, y));
            }
        }
        return ans;
    }

    private int isValidMaxVarience(String s, char x, char y) {
        int curr = 0;
        boolean check = false;
        int best = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == x) curr++;
            if (c == y) {
                curr--;
                check = true;
            }
            if (check) {
                best = Math.max(best, curr);
            }
            if (curr < 0) {
                curr = 0;
                check = false;
            }
        }
        return best;
    }
}
