// Last updated: 8/7/2025, 6:18:48 PM
class Solution {
    public int findDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length -1 ; i++) {
            if (nums[i] == nums[i+1]) {
                return nums[i];
            }
        }
        return -1;
    }
}