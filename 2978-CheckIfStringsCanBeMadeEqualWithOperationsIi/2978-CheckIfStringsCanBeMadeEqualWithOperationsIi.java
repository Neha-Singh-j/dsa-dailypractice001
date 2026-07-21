// Last updated: 7/21/2026, 11:52:04 AM
import java.util.*;

class Solution {
    public boolean checkStrings(String s1, String s2) {

        char[] even1 = new char[s1.length()];
        char[] odd1 = new char[s1.length()];
        char[] even2 = new char[s2.length()];
        char[] odd2 = new char[s2.length()];

        int e1 = 0, o1 = 0, e2 = 0, o2 = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) even1[e1++] = s1.charAt(i);
            else odd1[o1++] = s1.charAt(i);

            if (i % 2 == 0) even2[e2++] = s2.charAt(i);
            else odd2[o2++] = s2.charAt(i);
        }

        Arrays.sort(even1, 0, e1);
        Arrays.sort(odd1, 0, o1);
        Arrays.sort(even2, 0, e2);
        Arrays.sort(odd2, 0, o2);

        return Arrays.equals(even1, even2) && Arrays.equals(odd1, odd2);
    }
}