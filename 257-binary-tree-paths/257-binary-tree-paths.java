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
    public List<String> binaryTreePaths(TreeNode root) {
        // DFS algorithm with an added touch. There should be quite a lot of ways to approach
        // this problem.
        List<String> ans = new ArrayList<String>();
        String root_str = String.valueOf(root.val);
        if (root.left == null && root.right == null) ans.add(root_str);
        if (root.left != null) traverseTree(root.left, root_str, ans);
        if (root.right != null) traverseTree(root.right, root_str, ans);
        
        return ans;
    }
    
    public void traverseTree(TreeNode root, String curString, List<String> ans) {
        curString = curString + "->" + String.valueOf(root.val);
        if (root.left == null && root.right == null) ans.add(curString);
        if (root.left != null) traverseTree(root.left, curString, ans);
        if (root.right != null) traverseTree(root.right, curString, ans);
    }
}