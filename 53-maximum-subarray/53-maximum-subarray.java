import java.lang.*;
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int maxSumHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxSumHere = Math.max(nums[i], maxSumHere + nums[i]);
            maxSum = Math.max(maxSum, maxSumHere);
        }
        return maxSum;
    }
}