// Last updated: 7/26/2026, 10:55:20 PM
class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        
        int ans = -1;
        int curr = 0;
        boolean foundOne = false;
        
        while (!stack.isEmpty()) {
            char ch = stack.pop();
            
            if (ch == '1') {
                if (foundOne) {
                    ans = Math.max(ans, curr);
                }
                foundOne = true;
                curr = 0;
            } else {
                if (foundOne) {
                    curr++;
                }
            }
        }
        
        return ans==-1?0:ans+1;
    }
}