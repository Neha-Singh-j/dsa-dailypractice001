// Last updated: 7/26/2026, 10:52:40 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
 class Solution {
    int MOD = 1000000007;
    long total_sum = 0;
    long maxProd = 0;

    public int maxProduct(TreeNode root) {
        total_sum = total(root);
        sum(root);
        return (int)(maxProd % MOD);
    }

    public long sum(TreeNode root) {
        if (root == null) return 0;

        long left = sum(root.left);
        long right = sum(root.right);
        long currSum = left + right + root.val;

        long product = currSum * (total_sum - currSum);
        maxProd = Math.max(maxProd, product);
        return currSum;
    }

    public long total(TreeNode root) {
        if (root == null) return 0;
        return root.val + total(root.left) + total(root.right);
    }
}
