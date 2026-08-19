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
        Queue<TreeNode>queue = new LinkedList<>();
        List<List<Integer>>result = new ArrayList<>();
        if(root == null) return result;
        queue.offer(root);
        while(!queue.isEmpty()){
             int size = queue.size();
             int i=0;
             List<Integer>list = new ArrayList<>();
             while(i<size){
                   TreeNode node = queue.poll();
                   list.add(node.val);
                   if(node.left!=null){
                       queue.offer(node.left);
                   }
                   if(node.right!=null){
                       queue.offer(node.right);
                   }
                i++;
             }
             result.add(list);
        }
        return result;
    }
}
