// Last updated: 7/26/2026, 10:52:43 PM
import java.util.Arrays;

class Solution {
    public int[] sortByBits(int[] arr) {
        int[][] count = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            count[i][0] = arr[i];
            count[i][1] = binc(arr[i]); 
        }  

        // Sort first by the number of 1s, then by the actual value
        Arrays.sort(count, (a, b) -> {
            if (a[1] == b[1]) {
                return Integer.compare(a[0], b[0]);
            } else {
                return Integer.compare(a[1], b[1]);
            }
        });

        int[] ans = new int[arr.length];
        for (int i = 0; i < count.length; i++) {
            ans[i] = count[i][0];
        }

        return ans;
    }

    public static int binc(int n) {
        int c = 0;
        while (n > 0) {
            if (n % 2 == 1) c++;
            n /= 2;
        }
        return c;
    }
}