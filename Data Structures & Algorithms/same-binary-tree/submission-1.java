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
    boolean chsame = true;
    public boolean isSameTree(TreeNode p, TreeNode q) {
           checksame(p,q);
           return chsame;
    }
    public void checksame(TreeNode p,TreeNode q){
           if(p == null && q == null) return;
           if(p == null || q == null){
               chsame = false;
               return;
           }
           if(!chsame) return;
            
           if(p.val!=q.val) chsame = false;

           if(chsame){
               checksame(p.left,q.left);
               checksame(p.right,q.right);
           }
        return;
    }
}
