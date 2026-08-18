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
     int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
             checkdiameter(root);
             return max;
    }
    public int checkdiameter(TreeNode root){
            if(root == null) return 0;

            int left = checkdiameter(root.left);
            int right = checkdiameter(root.right);

            max = Math.max(left+right,max);

            return 1 + Math.max(checkdiameter(root.left),checkdiameter(root.right));
    }
}
