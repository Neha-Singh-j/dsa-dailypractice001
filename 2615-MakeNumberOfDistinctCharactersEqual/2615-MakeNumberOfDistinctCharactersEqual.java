// Last updated: 7/21/2026, 11:52:52 AM
class Solution {
    public boolean isItPossible(String word1, String word2) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];

        for (char c : word1.toCharArray()) f1[c - 'a']++;
        for (char c : word2.toCharArray()) f2[c - 'a']++;

        int d1 = 0, d2 = 0;
        for (int i = 0; i < 26; i++) {
            if (f1[i] > 0) d1++;
            if (f2[i] > 0) d2++;
        }
        for (int i = 0; i < 26; i++) {
            if (f1[i] == 0) continue;

            for (int j = 0; j < 26; j++) {
                if (f2[j] == 0) continue;
                    if (i == j) {
                    if (d1 == d2) return true;
                    continue;
                }

                int ptr1 = d1;
                int ptr2 = d2;
                if (f1[i] == 1) ptr1--;
                // word1 gains j
                if (f1[j] == 0) ptr1++;
                if (f2[j] == 1) ptr2--;
                // word2 gains i
                if (f2[i] == 0) ptr2++;
                if (ptr1 == ptr2) return true;
            }
        }
        return false;
    }
}
