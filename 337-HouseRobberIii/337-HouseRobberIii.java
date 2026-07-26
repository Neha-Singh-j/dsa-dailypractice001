// Last updated: 7/26/2026, 10:59:08 PM
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
    HashMap<TreeNode, Integer>map=new HashMap<>();
    public int rob(TreeNode root) {
        
        return find(root);
    }
    public int find(TreeNode root) {
        if(root==null) return 0;
        if(map.containsKey(root)) return map.get(root);
        int a=rob(root.left)+rob(root.right);
        int b=root.val;
        if(root.left!=null){
            b+=rob(root.left.left);
             b+=rob(root.left.right);
        }
        if(root.right!=null){
            b+=rob(root.right.left);
            b+=rob(root.right.right);
        }
        map.put(root,Math.max(a,b)); //maximum till root
        return Math.max(a,b);
    }
}