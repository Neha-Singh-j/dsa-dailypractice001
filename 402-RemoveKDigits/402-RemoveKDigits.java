// Last updated: 7/26/2026, 10:58:35 PM
class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            int val = num.charAt(i) - '0';
            
            while (!st.isEmpty() && k > 0) {
                if (st.peek() > val) {
                    st.pop();
                    k--;
                } else {
                    break;
                }
            }
            st.push(val);
        }

        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

         StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        sb.reverse();
        
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        if (sb.length() == 0) return "0";

        return sb.toString();
    }
}
