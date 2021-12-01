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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if (root == null) return ans;
        
        // Preorder = cur -> left -> right
        // 1. Visit top of stack, push right then left
        // 2. Top of stack would be the left node, repeat from 1 again
        // 3. If no more left node, the right nodes will now be visited starting with the one
        //    closest to the last left node
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.push(root);
        
        while (!s.isEmpty()) {
            TreeNode cur = s.pop();
            ans.add(cur.val);
            if (cur.right != null) s.push(cur.right);
            if (cur.left != null) s.push(cur.left);
        }
        return ans;
    }
}