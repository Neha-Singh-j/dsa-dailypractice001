// Last updated: 7/26/2026, 10:54:34 PM
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
    StringBuilder sb = new StringBuilder();

    public String smallestFromLeaf(TreeNode root) {
        ArrayList<String> arr = new ArrayList<>();
        find(root, arr);
        Collections.sort(arr);
        return arr.get(0);
    }

    private void find(TreeNode root, ArrayList<String> arr) {
        if (root == null) return;
        // as root given as number so to cast it to char  we add 'a'+root.val
        sb.append((char)(root.val + 'a'));

        if (root.left == null && root.right == null) {
            String curr = new StringBuilder(sb).reverse().toString();
            arr.add(curr);
        } else {
            find(root.left, arr);
            find(root.right, arr);
        }

        // backtrack: remove last character
        sb.deleteCharAt(sb.length() - 1);
    }
}
