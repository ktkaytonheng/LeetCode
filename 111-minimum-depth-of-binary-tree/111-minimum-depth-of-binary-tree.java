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
    public int minDepth(TreeNode root) {
        // Same problem as Max depth, but minimum instead
        // Use Queue to do BFS since we searching for nearest
        // On top of Queue, use for loop with queue.size() as iteration counter to keep track of each level
        // Increment depth for every level traversed
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int depth = 0;
        
        
        while (!q.isEmpty()) {
            int count = q.size();
            depth += 1;
            for (int i=0; i<count; i++) {
                TreeNode node = q.poll();
                if (node.left == null && node.right == null) return depth;
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
                
            }
            
        }
        return depth;
    }
}