// Last updated: 4/18/2026, 11:03:57 PM
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
15 */
16class Solution {
17    public boolean hasPathSum(TreeNode root, int targetSum) {
18        if(root==null) return false;
19        return check( root, 0, targetSum);
20    }
21    public static boolean check(TreeNode root, int sum, int tar){
22        if(root==null ) return false;
23        if(root.left==null && root.right==null) return sum+root.val==tar;
24        
25        return check(root.left, sum+root.val,tar) || check(root.right, sum+root.val,tar);
26    }
27}