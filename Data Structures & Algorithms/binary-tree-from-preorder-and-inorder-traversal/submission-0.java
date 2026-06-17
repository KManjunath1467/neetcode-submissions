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
       int preindex = 0;
       HashMap<Integer,Integer>map;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        int left=0,right= inorder.length-1;
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return buildtree(preorder,left,right);
    }
    private TreeNode buildtree(int[] preorder,int left,int right){
         if(left>right) return null;
          
          int val = preorder[preindex++];
          TreeNode root = new TreeNode(val);

           int inordindex = map.get(val);
           root.left = buildtree(preorder,left,inordindex-1);
           root.right = buildtree(preorder,inordindex+1,right);

           return root;
       }
}
