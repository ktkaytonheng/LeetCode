/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// Recursive solution, 100% runtime, 99.27% memory
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // If root is between p and q, return root
        if (root.val >= p.val && root.val <= q.val) return root;
        if (root.val <= p.val && root.val >= q.val) return root;
        
        // If root is smaller than p and q, recursive call on right side of BST
        // If root is larger than p and q, recursive call on left side of BST
        // This is due to property of BST
        if (root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
        if (root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        
        return root;
    }
}