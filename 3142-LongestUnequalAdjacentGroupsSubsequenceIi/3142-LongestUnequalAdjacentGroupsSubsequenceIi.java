// Last updated: 7/21/2026, 11:51:58 AM
class Solution {
    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        int n = words.length;
        List<List<String>> dp = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            List<String> curr = new ArrayList<>();
            curr.add(words[i]);
            dp.add(curr);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (groups[i] != groups[j] && words[i].length() == words[j].length()
                        && ham(words[i], words[j]) == 1) {
                    List<String> arr = new ArrayList<>(dp.get(j));
                    arr.add(words[i]);
                    if (arr.size() > dp.get(i).size()) {
                        dp.set(i, arr);
                    }
                }
            }
        }

        // Find the longest subsequence among all dp[i]
        List<String> best = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (dp.get(i).size() > best.size()) {
                best = dp.get(i);
            }
        }
        return best;
    }
     private static int ham(String a, String b) {
        int dist = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) dist++;
        }
        return dist;
    }

}