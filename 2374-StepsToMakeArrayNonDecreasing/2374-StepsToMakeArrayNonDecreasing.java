// Last updated: 7/26/2026, 10:49:26 PM
class Solution {
    public int totalSteps(int[] nums) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> step = new Stack<>();
        int ans = 0;
        for (int x : nums) {
            int curr = 0;
            while (!st.isEmpty() && st.peek() <= x) {
                curr = Math.max(curr, step.pop());
                st.pop();
            }
            if (!st.isEmpty()) curr++;
            ans = Math.max(ans, curr);
            st.push(x);
            step.push(curr);
        }
        return ans;
    }
}