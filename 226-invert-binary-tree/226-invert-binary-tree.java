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
    public TreeNode invertTree(TreeNode root) {
        if (root == null || (root.right == null && root.left == null)) return root;
        
        // Initializing helper function since traversing the tree doesn't require returning anything
        traverseTree(root);     
        return root;
    }
    
    public void traverseTree(TreeNode root) {
        // Flip left and right, recursive call on left and right nodes
        if (root == null) return;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        traverseTree(root.left);
        traverseTree(root.right);
    }
}