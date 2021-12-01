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
    public List<Integer> inorderTraversal(TreeNode root) {
        // Instantiate new list, if root empty return empty
        List<Integer> ans = new ArrayList<Integer>();
        if (root == null) return ans;
        
        // Approach: 
        // 1) Traverse down left node if cur node exist (Push cur to stack to keep track)
        // 2) If cur is null, means left node doesn't exist anymore, pop from stack to go
        //    back to prev node and travel down right node
        // Easier to watch video visualization
        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode cur = root;
        while (!s.isEmpty() || cur != null) {
            if (cur != null) {
                s.push(cur);
                cur = cur.left;
            }
            else {
                cur = s.pop();
                ans.add(cur.val);
                cur = cur.right;
            }
        }
        return ans;
    }
}