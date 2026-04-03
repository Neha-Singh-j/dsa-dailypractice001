// Last updated: 4/3/2026, 11:12:03 PM
1class Solution {
2    public boolean canBeEqual(String s1, String s2) {
3        char[] s1Even = {s1.charAt(0), s1.charAt(2)};
4        char[] s1Odd = {s1.charAt(1), s1.charAt(3)};
5        
6        char[] s2Even = {s2.charAt(0), s2.charAt(2)};
7        char[] s2Odd = {s2.charAt(1), s2.charAt(3)};
8        
9        Arrays.sort(s1Even);
10        Arrays.sort(s1Odd);
11        Arrays.sort(s2Even);
12        Arrays.sort(s2Odd);
13        
14        return Arrays.equals(s1Even, s2Even) && Arrays.equals(s1Odd, s2Odd);
15    }
16}