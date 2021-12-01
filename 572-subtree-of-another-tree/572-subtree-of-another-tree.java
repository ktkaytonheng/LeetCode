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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;
        
        // Helper function isSameTree to check if subtree of root == tree of subRoot
        // Return function is a OR as isSameTree will ONLY return true if the trees are
        // the exact same (including leaf nodes), so any of the recursive functions returning
        // true indicates that the subtree is within the tree.
        boolean sameTree = false;
        if (root.val == subRoot.val) sameTree = isSametree(root, subRoot);
        
        boolean left = false;
        boolean right = false;
        if (root.left != null) left = isSubtree(root.left, subRoot);
        if (root.right != null) right = isSubtree(root.right, subRoot);
        
        return left || right || sameTree;
    }
    
    public boolean isSametree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null ^ root2 == null) return false;
        if (root1.val != root2.val) return false;
        return (isSametree(root1.left, root2.left) && isSametree(root1.right, root2.right));
    }
}
