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
        Stack<TreeNode> nodes = new Stack<>();
        Stack<String> paths = new Stack<>();
        ArrayList<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        nodes.push(root);
        paths.push(Integer.toString(root.val));
        while (!nodes.empty()) {
            TreeNode node = nodes.pop();
            String path = paths.pop();
            if (node.left == null && node.right == null) {
                res.add(path);
            }
            if (node.left != null) {
                nodes.push(node.left);
                String pathLeft = path + ("->" + Integer.toString(node.left.val));
                paths.push(pathLeft);
            }
            if (node.right != null) {
                nodes.push(node.right);
                String pathRight = path + ("->" + Integer.toString(node.right.val));
                paths.push(pathRight);
            }
        }
        return res;
    }
} 