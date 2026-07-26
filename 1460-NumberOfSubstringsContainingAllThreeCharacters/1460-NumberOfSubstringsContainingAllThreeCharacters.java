// Last updated: 7/26/2026, 10:52:41 PM
class Solution {
    public int numberOfSubstrings(String s) {

        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int lo = 0;
        int hi = 0;
        int c = 0;

        while (hi < n) {

            char ch = s.charAt(hi);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() == 3) {

                c += (n - hi);

                char left = s.charAt(lo);
                map.put(left, map.get(left) - 1);

                if (map.get(left) == 0) {
                    map.remove(left);
                }

                lo++;
            }

            hi++;
        }

        return c;
    }
}