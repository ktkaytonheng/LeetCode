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
    public TreeNode sortedArrayToBST(int[] nums) {
        // Simple question if you understand what a BST is
        // -> Smaller value on the left
        // -> Bigger value on the right
        // 1. Start from the middle as the root (to guarantee height balance)
        // 2. Left subtree -> recursive left side of nums
        // 3. Right subtree -> recursive right side of nums
        if (nums.length == 0) return null;
        if (nums.length == 1) return new TreeNode(nums[0]);
        
        int middleIndex = nums.length/2;
        TreeNode root = new TreeNode(nums[middleIndex]);
        
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, middleIndex));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, middleIndex+1, nums.length));
        
        return root;
    }
}