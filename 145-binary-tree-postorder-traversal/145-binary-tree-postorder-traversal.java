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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        if (root == null) return ans;
        
        // Hardest problem out of all the tree traversal algorithms
        // Initialize an extra stack for the visited nodes as at that point of iteration, they are the
        // 'root' node, means they will be the last node to be output
        // Check traverse animation to better visualize
        Stack<TreeNode> in = new Stack<TreeNode>();
        Stack<Integer> out = new Stack<Integer>();
        in.push(root);
        
        while (!in.isEmpty()) {
            TreeNode cur = in.pop();
            out.push(cur.val);
            if (cur.left != null) in.push(cur.left);
            if (cur.right != null) in.push(cur.right);
        }
        
        while (!out.isEmpty()) {
            ans.add(out.pop());
        }
        return ans;
    }
}