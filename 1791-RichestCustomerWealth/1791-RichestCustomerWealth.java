// Last updated: 8/7/2025, 6:18:11 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int res = Integer.MIN_VALUE;
        for (int[] i : accounts) {
            int sum = 0;
            for (int j : i) {
                sum += j;
            }
            res = Math.max(res, sum);
        }

        return res;
    }
}