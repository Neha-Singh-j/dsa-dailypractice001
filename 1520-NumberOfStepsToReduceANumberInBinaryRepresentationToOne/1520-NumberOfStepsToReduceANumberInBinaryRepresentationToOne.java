// Last updated: 7/26/2026, 10:52:31 PM
    class Solution {
        public int numSteps(String s) {
            int carry = 0;
            int steps = 0;

            for(int i = s.length() - 1; i > 0; i--) {  // stop at index 1
                int b = s.charAt(i) - '0';
                int sum = b + carry;

                if(sum == 0) {
                    steps += 1;   // divide by 2
                } 
                else if(sum == 1) {
                    steps += 2;   // add 1 then divide
                    carry = 1;
                } 
                else { // sum == 2
                    steps += 1;   // divide
                    carry = 1;
                }
            }

            return steps + carry; // handle last bit
        }
    }