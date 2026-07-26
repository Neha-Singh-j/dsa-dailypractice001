// Last updated: 7/26/2026, 10:55:40 PM
class Solution {
    public boolean rotateString(String s, String goal) {
       
        // Step 1: Length check
        if (s.length() != goal.length()) return false;

        // Step 2: Check if goal is substring of s+s
        String combined = s + s;

        return combined.contains(goal);
    }
}