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

// Recursive method, 100% runtime, 27.69% memory
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return null;
        if (root1 != null && root2 == null) return root1;
        if (root1 == null && root2 != null) return root2;
        
        // Initialize a helper function to traverse down both trees
        // Since we're returning root1, whatever root1 is missing and root2 has, 
        // append to root1. Else, combine root1's value with root2's.
        
        traverseTree(root1, root2);
        return root1;
    }
    
    public void traverseTree(TreeNode root1, TreeNode root2) {
        if (root1 != null && root2 != null) root1.val += root2.val;
        
        if (root1 != null && root2 == null) return;
        else if (root1 == null && root2 != null) return;
        else if (root1 == null && root2 == null) return;
        else {
            if (root1.left == null && root2.left != null) root1.left = root2.left;
            else traverseTree(root1.left, root2.left);
            if (root1.right == null && root2.right != null) root1.right = root2.right;
            else traverseTree(root1.right, root2.right);
        }   
    }
}

// Iterative method, 22.49% runtime, 18.57% memory
// class Solution {
//     public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
//         if (root1 == null && root2 == null) return null;
//         if (root1 != null && root2 == null) return root1;
//         if (root1 == null && root2 != null) return root2;
        
//         Stack<TreeNode> s1 = new Stack();
//         s1.push(root1);
//         Stack<TreeNode> s2 = new Stack();
//         s2.push(root2);
        
//         while (!s1.empty() && !s2.empty()) {
//             TreeNode node1 = s1.pop();
//             TreeNode node2 = s2.pop();
            
//             node1.val += node2.val;
            
//             // If left/right exist in both tree1 and tree2, add to stack.
//             // Otherwise, if subtree only exists in tree1, do nothing.
//             // If subtree only exists in tree2, add it to tree1.
            
//             // Left subtree
//             if (node1.left != null && node2.left != null) {
//                 s1.push(node1.left);
//                 s2.push(node2.left);
//             }
//             else if (node2.left != null && node1.left == null) {
//                 node1.left = node2.left;
//             }
//             // Right subtree
//             if (node1.right != null && node2.right != null) {
//                 s1.push(node1.right);
//                 s2.push(node2.right);
//             }
//             else if (node2.right != null && node1.right == null) {
//                 node1.right = node2.right;
//             }
//         }
//         return root1;
//     }
// }