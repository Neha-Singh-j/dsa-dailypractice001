// Last updated: 7/26/2026, 10:50:19 PM
class Solution {
    int ans;
    public int minSessions(int[] tasks, int sessionTime) {
        Arrays.sort(tasks);                 
        ans = tasks.length;                 // worst case: one task per session
        List<Integer> res = new ArrayList<>();
        backtrack(tasks, tasks.length - 1, res, sessionTime);
        return ans;
    }

    private void backtrack(int[] arr, int idx, List<Integer> res, int sessionTime) {
        // all arr assigned
        if (idx < 0) {
            ans = Math.min(ans, res.size());
            return;
        }
        if (res.size() >= ans) return;
        int task = arr[idx];
        // try putting task into existing res
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i) + task <= sessionTime) {
                res.set(i, res.get(i) + task);
                backtrack(arr, idx - 1, res, sessionTime);
                res.set(i, res.get(i) - task);
            }
        }
        res.add(task);
        backtrack(arr, idx - 1, res, sessionTime);
        res.remove(res.size() - 1);
    }
}
