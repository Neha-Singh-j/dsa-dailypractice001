// Last updated: 7/12/2026, 12:16:15 AM
class Solution {
    public int mirrorFrequency(String s) {
        int sum = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        HashSet<Character> visited = new HashSet<>();

        // count frequency
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        // process pairs
        for (char ch : freq.keySet()) {
            if (visited.contains(ch)) continue;
            char m = mirror(ch);
            int f1 = freq.getOrDefault(ch, 0);
            int f2 = freq.getOrDefault(m, 0);

            sum += Math.abs(f1 - f2);

            // mark both as visited
            visited.add(ch);
            visited.add(m);
        }

        return sum;
    }

    public static char mirror(char ch) {
        if (Character.isDigit(ch)) {
            return (char) ('9' - (ch - '0'));
        } else {
            return (char) ('z' - (ch - 'a'));
        }
    }
}