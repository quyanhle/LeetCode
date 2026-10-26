/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        writeParentNode(map, root, root);
        ArrayList<TreeNode> pathP = new ArrayList<>();
        ArrayList<TreeNode> pathQ = new ArrayList<>();
        buildPath(map, pathQ, q.val);
        buildPath(map, pathP, p.val);
        if (pathP.size() > pathQ.size()) {
            if (pathP.contains(q)) {
                return q;
            }
            for (TreeNode i : pathP) {
                if (pathQ.contains(i)) {
                    return i;
                }
            }
        } else {
            if (pathQ.contains(p)) {
                return p;
            }
            for (TreeNode i : pathQ) {
                if (pathP.contains(i)) {
                    return i;
                }
            }
        }
        return null;
    }

    private void writeParentNode(HashMap<Integer, TreeNode> map, TreeNode root, TreeNode parent) {
        if (root == null) {
            return;
        }
        writeParentNode(map, root.left, root);
        map.put(root.val, parent);
        writeParentNode(map, root.right, root);
    }

    private void buildPath(HashMap<Integer, TreeNode> map, ArrayList<TreeNode> res, int start) {
        if (!map.containsKey(start)) {
            return;
        }
        TreeNode node = map.get(start);
        res.add(node);
        if ( node.val != start ) {
            buildPath(map, res, node.val);
        }
    }
}