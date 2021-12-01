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
    public boolean isSymmetric(TreeNode root) {
        // Base case
        if (root.left == null && root.right == null) return true;
        if (root.left == null ^ root.right == null) return false;
        
        // Same logic as checking if 2 trees are the same.
        // Initialize root.left as a tree and root.right as another tree
        // Set a queue for each tree and mirror append both trees
        // For e.g. if add right node for tree1, then add left node for tree2
        // While traversing, check if same, return false if different
        Queue<TreeNode> qL = new LinkedList<TreeNode>();
        Queue<TreeNode> qR = new LinkedList<TreeNode>();
        qL.add(root.left);
        qR.add(root.right);
        
        while (!qL.isEmpty() && !qR.isEmpty()) {
            TreeNode left = qL.poll();
            TreeNode right = qR.poll();
            if (left.val != right.val) return false;
            if (left.left == null ^ right.right == null) return false;
            else if (left.left != null) {
                qL.add(left.left);
                qR.add(right.right);
            }
            if (left.right == null ^ right.left == null) return false;
            else if (left.right != null) {
                qL.add(left.right);
                qR.add(right.left);
            }
        }
        return true;
        
    }
}