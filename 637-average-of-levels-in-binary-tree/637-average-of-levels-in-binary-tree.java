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
    public List<Double> averageOfLevels(TreeNode root) {
        // Use a for loop within queue while loop to keep track of elements in levels
        // Use the for loop to compute sum of values of that level, and average it, then
        // append it to list.
        
        List<Double> ans = new ArrayList<Double>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
        q.add(root);
        while (!q.isEmpty()) {
            double sum = 0;
            double noOfNodes = 0;
            int size = q.size();
            for (int i=0; i<size; i++) {
                TreeNode cur = q.poll();
                sum += cur.val;
                noOfNodes += 1;
                if (cur.left != null) q.add(cur.left);
                if (cur.right != null) q.add(cur.right);
            }
            double avg = sum / noOfNodes;
            ans.add(avg);
        }
        return ans;
    }
}