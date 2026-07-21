// Last updated: 7/21/2026, 11:49:09 AM
class Solution {
    public long minCost(String s, int[] cost) {
                long cnt = 0;
        for (int c : cost) {
            cnt += c;
        }
        long[] arr2 = new long[26];
        for (int i = 0; i < s.length(); i++) {
            arr2[s.charAt(i)-'a'] += cost[i];
        }
        return calc(cnt,arr2);
    }
    public long calc(long cnt, long[]arr2){
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            if (arr2[i] > 0) {
                ans = Math.min(ans, cnt - arr2[i]);
            }
        }
        return ans; 
    }
}