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
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Double> res = new ArrayList<>();
        
        if (root == null) {
            return res;
        }

        queue.offer(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            double sum = 0;
            for (int i = 0; i< n; i++) {
                TreeNode e = queue.poll();
                sum += e.val;
                if (e.left != null) {
                    queue.offer(e.left);
                }
                if (e.right != null) {
                    queue.offer(e.right);
                }
            }
            res.add((double) sum/n);
        }
        return res;
    }
}