// Last updated: 8/7/2025, 6:18:17 PM
class Solution {
    public int heightChecker(int[] heights) {
        int res = 0;
        int[] copy = new int[heights.length];
        for (int i =0; i< heights.length; i++) {
            copy[i] = heights[i];
        }
        Arrays.sort(heights);
        for (int i =0; i< heights.length; i++) {
            if (heights[i] != copy[i]) {
                res++;
            }
        }
        return res;
    }
}