class Solution {
    public int[] root;
    public int findCircleNum(int[][] isConnected) {
        this.unionFind(isConnected.length);
        for(int i = 0; i<isConnected.length; i++) {
            for (int j = 0; j<isConnected.length; j++) {
                if (isConnected[i][j] == 1) {
                    this.union(i, j);
                }
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i<this.root.length; i++) {
            set.add(this.find(i));
        }
        return set.size();
        
    }
    
    public void unionFind(int size) {
        this.root = new int[size];
        for (int i = 0; i < size; i++) {
            this.root[i] = i;
        }
    }
    
    public int find(int x) {
        if (this.root[x] == x) {
            return x;
        }
        this.root[x] = find(this.root[x]);
        return this.root[x];
    }

    public void union(int x, int y) {
        int rootX = this.find(x);
        int rootY = this.find(y);
        if (rootX != rootY) {
            root[rootY] = rootX;
        }
    } 
}