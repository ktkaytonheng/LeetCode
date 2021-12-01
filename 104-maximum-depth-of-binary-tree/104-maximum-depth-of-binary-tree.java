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
        // Finding max depth is to just use DFS to go down all the way till you hit a maximum
        // Since the first iteration might not guarantee max depth -> see example 1,
        // Traverse both sides from the root and use Math.max to return the greater value
        
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        
        return Math.max(maxDepth(root.right), maxDepth(root.left))+1;
    }
}