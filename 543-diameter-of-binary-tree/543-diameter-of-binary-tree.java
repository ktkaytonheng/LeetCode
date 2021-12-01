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
    int maxD = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        traverseTree(root);
        return maxD;
    }
    
    // This question is a bit difficult if you try to solve without a helper function. 
    // When you get stuck for these kind of question, it's usually the method itself that
    // limits your algorithms due to the return type. Hence, it can be solved by having a 
    // separate function that returns the maxDepth of the current node instead of max diameter,
    // so you can traverse the tree while keeping track of the depth.
    
    public int traverseTree(TreeNode root) {
        // Leaf node return 1
        if (root.left == null && root.right == null) return 1;
        
        int left = 0;
        int right = 0;
        if (root.left != null) left = traverseTree(root.left);
        if (root.right != null) right = traverseTree(root.right);
        
        int maxDepth = Math.max(left, right);
        maxD = Math.max(maxD, Math.max(left+right, maxDepth));
        return maxDepth+1;
    }
}