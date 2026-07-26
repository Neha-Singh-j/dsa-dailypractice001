// Last updated: 7/26/2026, 10:54:14 PM
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
    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        int l=1;
        int maxl=1;
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return 0;
        q.add(root);
        while(!q.isEmpty()){
            int s=q.size();
            int curr=0;
            for(int i=0;i<s;i++){
                TreeNode p=q.poll();
                curr+=p.val;
                if(p.left!=null) q.add(p.left);
                if(p.right!=null) q.add(p.right);
            }
           if(curr>max){
            max=curr;
            maxl=l;;
           }

            l++;
        }
        return maxl;
    }
}