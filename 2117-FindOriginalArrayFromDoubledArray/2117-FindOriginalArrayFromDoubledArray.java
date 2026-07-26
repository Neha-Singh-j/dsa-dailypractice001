// Last updated: 7/26/2026, 10:50:18 PM
import java.util.*;

class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length;
        if (n % 2 != 0) return new int[0];

        Arrays.sort(changed);
        boolean[] arr = new boolean[n];
        int[] curr = new int[n / 2];
        int idx = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]) continue;
            j = Math.max(j, i + 1);
            while (j < n && (arr[j] || changed[j] != changed[i] * 2)) {
                j++;
            }
            if (j == n) return new int[0];
            arr[i] = true;
            arr[j] = true;
            curr[idx++] = changed[i];
        }

        return curr;
    }
}
