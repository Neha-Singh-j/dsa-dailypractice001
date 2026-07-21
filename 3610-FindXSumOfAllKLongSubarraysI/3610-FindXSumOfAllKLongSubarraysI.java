// Last updated: 7/21/2026, 11:51:16 AM
class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int[] res = new int[nums.length - k + 1];
        for(int i = 0; i <= nums.length - k; i++) {
            res[i] = x_sum(nums, i, i + k, x);
        }
        return res;
    }

    public static int x_sum(int[] nums, int idx, int j, int x) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = idx; i < j; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> (a[1] == b[1] ? b[0] - a[0] : b[1] - a[1])
        );

        for(int key : map.keySet()) {
            pq.add(new int[]{key, map.get(key)});
        }

        int sum = 0;
        int cnt = 0;

        while(!pq.isEmpty() && cnt < x) {
            int[] top = pq.poll();
            sum += top[0] * top[1];
            cnt++;
        }

        return sum;
    }
}
