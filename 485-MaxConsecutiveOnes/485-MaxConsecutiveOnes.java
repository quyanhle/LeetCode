// Last updated: 8/7/2025, 6:18:38 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int result = 0;

        for (int i=0; i<nums.length; i++) {
            
            if (nums[i] == 1) {
                result++;
            } else {
                max = max <= result ? result : max;
                result = 0;
            }
        }
        return max = max <= result ? result : max;
    }
}