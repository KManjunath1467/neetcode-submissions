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
    int key = -1;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
           checkk(root,k);
           return key;
    }
    public void checkk(TreeNode root,int k){
              if(root == null){
                  return;
              }
              if(key!=-1){
                 return;
              }
        
        checkk(root.left,k);
        count++;
        if(count == k){
             key = root.val;
             return;
        }
        checkk(root.right,k);
    }
}
