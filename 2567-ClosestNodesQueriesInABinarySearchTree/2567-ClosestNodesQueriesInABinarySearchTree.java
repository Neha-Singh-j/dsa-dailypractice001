// Last updated: 7/26/2026, 10:48:14 PM
class Solution {

    ArrayList<Integer> curr;

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
        List<List<Integer>> ans = new ArrayList<>();
        curr = new ArrayList<>();
        find(root);   // inorder -> sorted list
        for (int x : queries) {
            int small = floor(x);
            int large = ceil(x);
            List<Integer> temp = new ArrayList<>();
            temp.add(small);
            temp.add(large);
            ans.add(temp);
        }
        return ans;
    }
    public void find(TreeNode root) {
        if (root == null) return;
        find(root.left);
        curr.add(root.val);
        find(root.right);
    }

    // largest value <= x
    public int floor(int x) {
        int l = 0, r = curr.size() - 1;
        int ans = -1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (curr.get(mid) <= x) {
                ans = curr.get(mid);
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
    // smallest value >= x
    public int ceil(int x) {
        int l = 0, r = curr.size() - 1;
        int ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;

            if (curr.get(mid) >= x) {
                ans = curr.get(mid);
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }
}
