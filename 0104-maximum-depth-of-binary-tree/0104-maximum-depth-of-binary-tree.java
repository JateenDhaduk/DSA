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
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root == null) return 0;
        int depth = 0;
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelNum = queue.size();

            for(int i = 0; i < levelNum; i++){
                if(queue.peek().left  != null) queue.offer(queue.peek().left);
                if(queue.peek().right  != null) queue.offer(queue.peek().right);

                queue.poll();
            }
            depth++;
        }

        return depth;
    }

}