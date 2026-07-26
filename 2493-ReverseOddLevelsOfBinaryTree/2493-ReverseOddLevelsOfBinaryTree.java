// Last updated: 7/26/2026, 10:48:36 PM
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
    public TreeNode reverseOddLevels(TreeNode root) {
        bfs(root);
        return root;
    }
    public void bfs(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int lvl=0;
        while(!q.isEmpty()){
            int s=q.size();
            ArrayList<TreeNode> curr=new ArrayList<>();
                for(int i=0;i<s;i++){
                    TreeNode r=q.poll();
                    curr.add(r);
                    if(r.left!=null){
                        q.add(r.left);
                    }
                    if(r.right!=null){
                         q.add(r.right);
                    }
                }
            if(lvl%2!=0){
                int a=0;
                int b=s-1;
                while(a<b){
                    int temp=curr.get(a).val;
                    curr.get(a).val=curr.get(b).val;
                    curr.get(b).val=temp;
                    a++;
                    b--;
                }
            }
            lvl++;

        }
    }
}