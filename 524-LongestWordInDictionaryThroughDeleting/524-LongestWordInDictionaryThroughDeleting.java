// Last updated: 7/26/2026, 10:57:34 PM
class Solution {
    public String findLongestWord(String s, List<String> dict) {
        int max = 0; // length of longest word found
        String ans = "";
        
        for (String curr : dict) {
            int k = 0;
            for (int j = 0; j < s.length(); j++) { 
                if (k < curr.length() && curr.charAt(k) == s.charAt(j)) {
                    k++;
                }
            }
            
            if (k == curr.length()) { // curr can be formed
                if (curr.length() > max) {
                    max = curr.length(); // update max
                    ans = curr;
                } else if (curr.length() == max) {
                    if (curr.compareTo(ans) < 0) {
                        ans = curr;
                    }
                }
            }
        }
        
        return ans;
    }
}
