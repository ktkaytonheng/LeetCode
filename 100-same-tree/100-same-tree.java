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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Easiest method using recursive, since current method takes in nodes from both tree
        // Travel equally and return false if doesn't match
        if (p == null && q == null) return true;
        if (p == null ^ q == null) return false;
        if (p.val != q.val) return false;
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

// 2 stack iterative DFS, 100% runtime, 5.03% memory

// Iteratively is slightly harder, as you'll need to initialize a stack for each tree, and handle 
// the traversing separately. It's basically x2 of DFS for one tree. Can use BFS as well.

// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {
//         if (p == null && q == null) return true;
//         if (p == null ^ q == null) return false;
        
//         Stack<TreeNode> s1 = new Stack<>();
//         s1.push(p);
//         Stack<TreeNode> s2 = new Stack<>();
//         s2.push(q);
        
        
//         while (!s1.empty() && !s2.empty()) {
//             TreeNode cur1 = s1.pop();
//             TreeNode cur2 = s2.pop();
//             if (cur1.val != cur2.val) return false;
            
//             if (cur1.left == null ^ cur2.left == null) return false;
//             if (cur1.right == null ^ cur2.right == null) return false;
            
//             if (cur1.left != null) s1.push(cur1.left);
//             if (cur2.left != null) s2.push(cur2.left);
//             if (cur1.right != null) s1.push(cur1.right);
//             if (cur2.right != null) s2.push(cur2.right);
//         }
        
//         return true;
//     }
// }