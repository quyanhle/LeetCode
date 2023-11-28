class Solution {
    public boolean canJump(int[] nums) {
        int jumpIdx = 0;
        for (int i = 0; i<nums.length && i<= jumpIdx; i++) {
            jumpIdx = Math.max(i+nums[i], jumpIdx);
            if (jumpIdx >= nums.length - 1) {
                return true;
            }
        }
        return false;
    }
}