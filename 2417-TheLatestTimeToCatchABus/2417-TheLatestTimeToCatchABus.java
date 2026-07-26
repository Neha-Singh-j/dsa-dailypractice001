// Last updated: 7/26/2026, 10:49:17 PM
import java.util.*;

class Solution {
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int cap) {
        int n1 = buses.length, n2 = passengers.length;
        int j = 0;
        int ans = 0;

        HashSet<Integer> set = new HashSet<>();

        Arrays.sort(buses);
        Arrays.sort(passengers);

        for (int i = 0; i < n1; i++) {
            int c = 0;

            while (c < cap && j < n2 && passengers[j] <= buses[i]) {
                if (!set.contains(passengers[j] - 1)) {
                    ans = passengers[j] - 1;
                }
                set.add(passengers[j]);
                c++;
                j++;
            }

            if (c < cap && !set.contains(buses[i])) {
                ans = buses[i];
            }
        }

        return ans;
    }
}
