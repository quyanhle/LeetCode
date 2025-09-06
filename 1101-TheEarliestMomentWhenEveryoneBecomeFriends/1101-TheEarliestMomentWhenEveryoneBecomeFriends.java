// Last updated: 9/6/2025, 10:59:10 AM
class Solution {
    public int[] root;
    public int[] rank;
    public void disjointSet(int n) {
        root = new int[n];
        rank = new int[n];
        for (int i=0; i<root.length; i++) {
            root[i] = i;
            rank[i] = 1;
        }
    }
    
    public int find(int x) {
        if (x == root[x]) {
            return x;
        }
        return root[x] = find(root[x]);
    }

    public boolean union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        boolean isMerged = false;
        if (rootX == rootY) {
            return isMerged;
        }

        isMerged = true;
       
            if (rank[rootX] > rank[rootY]) {
                root[rootY] = rootX;
            } else if (rank[rootX] < rank[rootY]) {
                root[rootX] = rootY;
            } else {
                root[rootY] = rootX;
                rank[rootX] += 1;
            }
        return isMerged;
    }
    

    public int earliestAcq(int[][] logs, int n) {
        Arrays.sort(logs, (s1, s2) -> s1[0] - s2[0]);
        disjointSet(n);
        int cnt = n;
        for(int i=0; i<logs.length; i++) {
            if(union(logs[i][1], logs[i][2])) {
                cnt--;
            } 
            if (cnt == 1) {
                return logs[i][0];
            }
        }
        
        return -1;
    }
}