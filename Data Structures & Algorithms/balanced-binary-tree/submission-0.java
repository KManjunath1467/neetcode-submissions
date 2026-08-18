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
    boolean isbalan = true;
    public boolean isBalanced(TreeNode root) {
        checkbalance(root);
        return isbalan;
    }
    public int checkbalance(TreeNode root){
           if(root == null){
               return 0;
           }
           int left = checkbalance(root.left);
           int right = checkbalance(root.right);
          
           int balan = left - right;
           if(balan <-1 || balan >1){
                  isbalan = false;
           }

           return 1+Math.max(checkbalance(root.left),checkbalance(root.right));
    }
}
