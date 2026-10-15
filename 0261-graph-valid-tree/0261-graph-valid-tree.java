class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (n - 1 != edges.length) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        int[] root = new int[n];
        for(int i = 0; i<n; i++) {
            root[i] = i;
        }
        for(int i = 0; i < edges.length; i++) {
            union(root, edges[i][0], edges[i][1]);
        }
        for(int i = 0; i<n-1; i++) {
            if (find(root, i) != find(root, i+ 1)) {
                return false;
            }
        }
        return true;
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
        if (rootX != rootY) {
            root[rootY] = rootX;
        }
    }
}