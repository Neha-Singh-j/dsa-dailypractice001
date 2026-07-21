// Last updated: 7/21/2026, 11:49:40 AM
class Solution {
     public int fn1(HashMap<Integer,Integer> frq){
        int count = 0;
        for (int v : frq.values())
            count = Math.max(count, v);
        return count;
     }
    public int minSwaps(int[] nums, int[] forbidden) {
        Map<Integer, Integer> mp1 = new HashMap<>();
        HashMap<Integer, Integer> frq = new HashMap<>();
        Map<Integer, Integer> mp2 = new HashMap<>();
        int n = nums.length;
        for (int x : nums)
            mp1.put(x, mp1.getOrDefault(x, 0) + 1);
        for (int x : forbidden)
            mp2.put(x, mp2.getOrDefault(x, 0) + 1);

        for (int x : mp1.keySet()) {
            int have = mp1.get(x);
            int fbd = mp2.getOrDefault(x, 0);
            if (have > n - fbd)
                return -1;
        }

        int xy = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == forbidden[i]) {
                xy++;
                frq.put(nums[i], frq.getOrDefault(nums[i], 0) + 1);
            }
        }

        if (xy == 0) return 0;
        int count=fn1(frq);
        return Math.max(count, (xy + 1) / 2);
    }
}
