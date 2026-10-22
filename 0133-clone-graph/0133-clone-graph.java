/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {

    public Node cloneGraph(Node node) {
        HashMap<Node, Node> map = new HashMap<>();
        if (node == null) {
            return null;
        }
        
        return dfs(map, node);
    }

    private Node dfs(HashMap<Node, Node> map, Node curr) {
        if (map.containsKey(curr)) {
            return map.get(curr);
        }
        Node newNode = new Node(curr.val);
        map.put(curr, newNode);
        for (Node e : curr.neighbors) {
            newNode.neighbors.add(dfs(map, e));
        }
        return newNode;
    }
}