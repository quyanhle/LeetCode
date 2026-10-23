class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int[] state = new int[numCourses];
        for(int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }
        for(int[] arr : prerequisites) {
            list.get(arr[1]).add(arr[0]);
        }
        for (int i = 0; i< numCourses; i++) {
            if (!dfs(list, i, state)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs (ArrayList<ArrayList<Integer>> list, int curr, int[] state) {
        if (state[curr] == 1) {
            return false;
        }
        if (state[curr] == 2) {
            return true;
        }
        state[curr] = 1;
        for (int l : list.get(curr)) {
            if (!dfs(list, l, state)) {
                return false;
            }
        }
        state[curr] = 2;
        return true; 
    }
}