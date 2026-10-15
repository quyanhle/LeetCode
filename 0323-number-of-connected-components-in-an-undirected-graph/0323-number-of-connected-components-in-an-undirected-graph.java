class Solution {
    public int countComponents(int n, int[][] edges) {
        int[] root = new int[n];
        for (int i = 0; i< n; i++) {
            root[i] = i;
        }
        for (int i = 0; i < edges.length; i++) {
            union(root, edges[i][0], edges[i][1]);
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<n; i++) {
            int rootI = find(root, i);
            if (!map.containsKey(rootI)) {
                map.put(rootI, 1);
            }
        }
        return map.size();
    }

    private int find(int[] root, int x) {
        if (root[x] == x) {
            return root[x];
        }
        return find(root, root[x]);
    }

    private void union(int[] root, int x, int y) {
        int rootX = find(root, x);
        int rootY = find(root, y);
        if (rootY != rootX) {
            root[rootY] = rootX;
        }
    }
}