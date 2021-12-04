/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        // BFS solution, with extra for loop for keeping track of each level
        if (root == null) return 0;
        int depth = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int qSize = q.size();
            for (int i=0; i<qSize; i++) {
                Node cur = q.poll();
                for (Node node: cur.children) {
                    q.add(node);
                }
            }
            depth++;
        }
        return depth;
    }
}