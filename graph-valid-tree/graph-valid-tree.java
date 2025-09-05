class Solution {
    public int[] root;
    public int[] rank;
    
    public void unionFind(int size) {
        this.root = new int[size];
        this.rank = new int[size];
        for (int i = 0; i < size; i++) {
            this.root[i] = i;
        }
    }
    
    public int find(int x) {
        return this.root[x];
    }

    public void union(int x, int y) {
        
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            for (int i = 0; i < root.length; i++) {
                if (root[i] == rootY) {
                    root[i] = rootX;
                }
            }
        }
    } 
    
    public boolean validTree(int n, int[][] edges) {       
        this.unionFind(n);
        for (int[] edge : edges) {
            int rootA = this.find(edge[0]);
            int rootB = this.find(edge[1]);
            
            if (rootA == rootB) {
                return false;
            }
            
            this.union(edge[0], edge[1]);
        }
        
        for (int i = 0; i < root.length - 1; i++) {
            if (root[i] != root[i+1]) {
                return false;
            }
        }
        
        return true;
    }
}