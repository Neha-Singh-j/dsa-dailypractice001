// Last updated: 7/26/2026, 10:52:45 PM
class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        return delete(root, target);
    }

    public TreeNode delete(TreeNode root, int target) {
        if (root == null) return null;

        // assign back after recursion
        root.left = delete(root.left, target);
        root.right = delete(root.right, target);

        // check leaf condition AFTER updating children
        if (root.left == null && root.right == null && root.val == target) {
            return null;
        }

        return root;
    }
}