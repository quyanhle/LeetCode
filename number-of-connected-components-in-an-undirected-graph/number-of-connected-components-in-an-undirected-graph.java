class Solution {
    public int[] root;
    public int countComponents(int n, int[][] edges) {
        disjointSet(n);
        HashSet<Integer> set = new HashSet<>();
        for (int[] edge: edges) {
            union(edge[0], edge[1]);
        }
        
        for (int j : root) {
            set.add(j);
        }
        
        return set.size();
    }
    
    public void disjointSet(int n) {
        root = new int[n];
        for (int i = 0; i< n; i++) {
            root[i] = i;
        }
    }
    
    public int find(int x) {
        return root[x];
    }
    
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        
        if (rootX != rootY) {
            for(int i=0; i<root.length; i++) {
                if (root[i] == rootY) {
                    root[i] = rootX;
                }
            }
        }
    }
    
}