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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        if (root.left == null && root.right == null) return true;
        
        if (getHeight(root) != -1) return true;
        else return false;
    }
    
    // This question is a bit more tricky
    // To make sure information get passed up the hierarchy (returning values up the tree)
    // - We return -1 if there is a height inbalance
    // - If the returned value from left or right is -1, we return -1 as well
    // - The main function then check if the returned value is -1, which indicates imbalance
    public int getHeight(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        
        if (left == -1 || right == -1) return -1;
        else if (Math.abs(left - right) > 1) return -1;
        else return Math.max(left, right) + 1;      
    }
}

// Side note:
// It should also be possible to get max depth of right and left, then subtract to determine imbalance
// Not tested by me, but theoretically it should be a viable way. Can try as extra