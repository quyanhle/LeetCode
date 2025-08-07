// Last updated: 8/7/2025, 6:18:49 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIdx = 0;
        
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIdx++] = nums[i];
            }
        }
        
        for (int i=nonZeroIdx; i<nums.length; i++) {
            nums[i] = 0;
        }
    }
}