// Last updated: 7/26/2026, 10:54:42 PM
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
    int moves=0;
    public int distributeCoins(TreeNode root) {
        // req-> -1
        //  extra with -> + count
       int c = CountMoves(root);
        return moves;
    }
    public  int CountMoves(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = CountMoves(root.left);
        int right=CountMoves(root.right);
        moves+= Math.abs(left)+Math.abs(right);
        return root.val-1+left+right;

    }
}