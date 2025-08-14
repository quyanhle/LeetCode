// Last updated: 8/13/2025, 8:54:39 PM
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0], maxHere = nums[0];
        for(int i = 1; i < nums.length; i++) {
            maxHere = Math.max(maxHere + nums[i], nums[i]);
            maxSoFar = Math.max(maxHere, maxSoFar);
        }
        return maxSoFar;
    }
}