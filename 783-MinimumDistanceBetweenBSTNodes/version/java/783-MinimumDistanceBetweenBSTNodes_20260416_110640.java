// Last updated: 4/16/2026, 11:06:40 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */class Solution {
16    static int min = Integer.MAX_VALUE;
17    static TreeNode prev = null;
18
19    public int minDiffInBST(TreeNode root) {
20        min = Integer.MAX_VALUE;  
21        prev = null;             
22        minDist(root);
23        return min;
24    }
25
26    public static void minDist(TreeNode root) {
27        if (root == null) return;
28         minDist(root.left);
29
30        if (prev != null) {
31            min = Math.min(min, root.val - prev.val);
32        }
33        prev = root; 
34        minDist(root.right);
35    }
36}
37