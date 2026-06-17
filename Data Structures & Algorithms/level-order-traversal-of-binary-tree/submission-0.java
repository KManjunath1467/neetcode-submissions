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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode>queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
             int size = queue.size();
             List<Integer>list = new ArrayList<>();
               int n = queue.size();

               for(int i=0;i<n;i++){
                TreeNode node = queue.poll();
                 list.add(node.val);
                  if(node.left!=null) queue.offer(node.left);
                  if(node.right!=null) queue.offer(node.right);
               }
         result.add(list);
        }
        return result;
    }
}
